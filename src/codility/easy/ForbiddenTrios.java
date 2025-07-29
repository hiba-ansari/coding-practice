package codility.easy;

/*
Write a function solution that, given a string S of N lowercase English letters, returns a string with no instances of
three identical consecutive letters, obtained from S by deleting the minimum possible number of letters.

Examples:
1. Given S = "eedaaad", the function should return "eedaad". One occurrence of letter a is deleted.
2. Given S = "xxxtxxx", the function should return "xxtxx". Note that letter x can occur more than three times in the
returned string, if the occurrences are not consecutive.
3. Given S = "uuuuxaaaaxuuu", the function should return "uuxaaxuu".

Write an efficient algorithm for the following assumptions:
• N is an integer within the range (1..200,000);
• string S consists only of lowercase letters (a-z).
 */
public class ForbiddenTrios {
    public String solution(String S) {
        int copies = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));

        for (int i = 1; i < S.length(); i++) {
            char currChar = S.charAt(i);
            if (currChar == S.charAt(i-1)) {
                copies++;
            }
            else {
                copies = 0;
            }

            if (copies < 2) {
                sb.append(currChar);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ForbiddenTrios forbiddenTrios = new ForbiddenTrios();
        System.out.println(forbiddenTrios.solution("eedaaaaaad"));
        System.out.println(forbiddenTrios.solution("xxxtxxxx"));
        System.out.println(forbiddenTrios.solution("uuuuxaaaaxuuu"));
        System.out.println(forbiddenTrios.solution("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu"));
    }
}
