package exercism.medium;

public class ISBNVerifierDS {
    public static boolean isValidISBN(String isbn) {
        // Remove all hyphens from the input string
        String cleaned = isbn.replace("-", "");

        // Check length - must be exactly 10 characters
        if (cleaned.length() != 10) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            char c = cleaned.charAt(i);
            int value;

            // Check the last character (can be X)
            if (i == 9 && (c == 'X' || c == 'x')) {
                value = 10;
            }
            // Check if other characters are digits
            else if (Character.isDigit(c)) {
                value = Character.getNumericValue(c);
            }
            else {
                return false; // invalid character found
            }

            // Multiply by the appropriate weight (10 to 1)
            sum += value * (10 - i);
        }

        // Check if the sum is divisible by 11
        return sum % 11 == 0;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "3-598-21508-8",    // valid
                "3-598-21507-X",    // valid
                "3598215088",      // valid (no hyphens)
                "359821507X",       // valid (no hyphens)
                "3-598-21507-A",    // invalid (contains 'A')
                "3-598-21507-1",    // invalid (wrong check digit)
                "123456789",       // invalid (too short)
                "123456789012",     // invalid (too long)
                "3-598-21508-8-1",  // invalid (too many hyphens)
                ""                  // invalid (empty)
        };

        for (String test : testCases) {
            System.out.printf("'%s' is %s%n", test,
                    isValidISBN(test) ? "valid" : "invalid");
        }
    }
}
