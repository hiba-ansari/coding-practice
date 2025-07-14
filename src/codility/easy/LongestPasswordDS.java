package codility.easy;

public class LongestPasswordDS {
    public int solution(String S) {
        String[] words = S.split(" ");
        int maxLength = -1;

        for (String word : words) {
            if (isValidPassword(word)) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                }
            }
        }

        return maxLength;
    }

    private boolean isValidPassword(String word) {
        int letterCount = 0;
        int digitCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                return false; // contains non-alphanumeric character
            }
        }

        return (letterCount % 2 == 0) && (digitCount % 2 == 1);
    }
}
