package codility.easy;

public class ReplaceByFiveDS {
    public static String solution(String S, int K) {
        char[] digits = S.toCharArray();
        int nonFiveCount = 0;

        // First count how many non-5 digits we have
        for (char c : digits) {
            if (c != '5') {
                nonFiveCount++;
            }
        }

        // If we can't make exactly K moves, return "IMPOSSIBLE"
        if (nonFiveCount < K) {
            return "IMPOSSIBLE";
        }

        // We'll replace the leftmost non-5 digits to maximize the number
        int replacementsLeft = K;
        for (int i = 0; i < digits.length && replacementsLeft > 0; i++) {
            if (digits[i] != '5') {
                digits[i] = '5';
                replacementsLeft--;
            }
        }

        return new String(digits);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(solution("165232", 3));    // Output: "565552"
        System.out.println(solution("1839550", 4));   // Output: "5855555"
        System.out.println(solution("5567855", 4));   // Output: "IMPOSSIBLE"
        System.out.println(solution("55555", 0));     // Output: "55555"
        System.out.println(solution("12345", 5));     // Output: "55555"
        System.out.println(solution("12345", 6));     // Output: "IMPOSSIBLE"
    }
}
