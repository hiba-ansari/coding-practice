package exercism.medium;
import java.util.HashSet;
import java.util.Set;

public class IsogramCheckerDS {
    public static boolean isIsogram(String input) {
        // Convert to lowercase to make it case-insensitive
        String str = input.toLowerCase();
        Set<Character> seenLetters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Skip spaces and hyphens
            if (c == ' ' || c == '-') {
                continue;
            }

            // Check if we've seen this letter before
            if (seenLetters.contains(c)) {
                return false;
            }

            // Add the letter to our set
            seenLetters.add(c);
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "lumberjacks",
                "background",
                "downstream",
                "six-year-old",
                "isograms",
                "Emily Jung Schwartzkopf",
                "alphAbet",
                "a b c d e f g",
                "hello-world",
                ""
        };

        for (String test : testCases) {
            System.out.printf("'%s' is %s an isogram%n", test,
                    isIsogram(test) ? "" : "not");
        }
    }
}
