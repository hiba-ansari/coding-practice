package codility.easy;

/*
There is a string S representing a positive number consisting of N digits. In one move, you can choose some digit of S
that is not equal to 5 and replace it with the digit 5. What is the maximum number that can be obtained after making
exactly K moves?

Write a function:

def solution(S, K)

that, given a string S and an integer K, returns a string representing the maximum value that can be obtained after
making exactly K moves. If making exactly K moves is impossible, return "IMPOSSIBLE".

Examples:
1. Given S = "165232" and K = 3, the function should return "565552". This is the largest number that can be achieved by
replacing three digits that are not already 5s with 5s.
2. Given S = "1839550" and K = 4, the function should return "5855555".
3. Given S = "5567855" and K = 4, the function should return "IMPOSSIBLE". It is not possible to make four moves because
S contains only three digits that are not 5s.

Write an efficient algorithm for the following assumptions:
• N is an integer within the range [1..100,000];
• K is an integer within the range [0..100,000];
• string S is made only of digits (0-9) and does not contain leading zeros.
 */
public class ReplaceByFive { //20 mins

    public String solution2(String S, int K) {
        StringBuilder sb = new StringBuilder();
//        int fives = 0;
        int i = 0;
        for (i = 0; i < S.length() && K >0 ; i++) {
            char currChar = S.charAt(i);
            if (Integer.parseInt(String.valueOf(currChar)) >= 5 /*|| fives == K*/) {
                sb.append(currChar);
            }
            else {
                sb.append("5");
//                fives++;
                K--;
            }
        }
        sb.append(S.substring(i));

        return (K == 0) ? sb.toString() : "IMPOSSIBLE";
    }

    public String solution(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int fives = 0;

        for (int i = 0; i < S.length(); i++) {
            char currChar = S.charAt(i);
            if (Integer.parseInt(String.valueOf(currChar)) >= 5 || fives == K) {
                sb.append(currChar);
            }
            else {
                sb.append("5");
                fives++;
            }
        }

        return (fives == K) ? sb.toString() : "IMPOSSIBLE";
    }

    public static void main(String[] args) {
        ReplaceByFive replaceByFive = new ReplaceByFive();
        System.out.println(replaceByFive.solution2("523108876546789765432234876545678976544678654678976578657865786578656789657896", 4));
        System.out.println(replaceByFive.solution2("5231", 4));
        System.out.println(replaceByFive.solution2("5555555", 4));
        System.out.println(replaceByFive.solution2("550", 1));
        System.out.println(replaceByFive.solution2("20", 20));
        System.out.println(replaceByFive.solution2("10040531", 2));

    }
}
