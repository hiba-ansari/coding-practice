package exercism.medium;

/*
The ISBN-10 format is 9 digits (0 to 9) plus one check character (either a digit or an X only). In the case the check
character is an X, this represents the value '10'. These may be communicated with or without hyphens, and can be checked
for their validity by the following formula:

(d₁ * 10 + d₂ * 9 + d₃ * 8 + d₄ * 7 + d₅ * 6 + d₆ * 5 + d₇ * 4 + d₈ * 3 + d₉ * 2 + d₁₀ * 1) mod 11 == 0
If the result is 0, then it is a valid ISBN-10, otherwise it is invalid.

Example
Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula, and get:

(3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 * 1) mod 11 == 0
Since the result is 0, this proves that our ISBN is valid.

Task
Given a string the program should check if the provided string is a valid ISBN-10. Putting this into place requires some
thinking about preprocessing/parsing of the string prior to calculating the check digit for the ISBN.

The program should be able to verify ISBN-10 both with and without separating dashes.

Caveats
Converting from strings to numbers can be tricky in certain languages. Now, it's even trickier since the check digit of
an ISBN-10 may be 'X' (representing '10'). For instance 3-598-21507-X is a valid ISBN-10.
 */
public class ISBNVerifier {
    boolean isValid(String stringToVerify) {
        String cleanedNo = stringToVerify.replace("-", "");
        int result = 0;
        int value = 10;

        if (cleanedNo.length() != 10) {
            return false;
        }
        else {
            for (int i = 0; i < cleanedNo.length(); i++) {
                char currChar = cleanedNo.charAt(i);
                if (Character.isDigit(currChar)) {
                    result += (currChar - '0') * value;
                } else if (currChar == 'X' || currChar == 'x') {
                    result += 10 * value;
                }
                else return false;
                value--;
            }
            return result % 11 == 0;
        }
    }

    public static void main(String[] args) {
        ISBNVerifier verifier = new ISBNVerifier();
        System.out.println(verifier.isValid("3-598-2X507-9"));
    }
}
