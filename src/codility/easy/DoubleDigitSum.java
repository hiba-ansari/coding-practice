package codility.easy;

/*
Write a function:
def solution(N)
that, given an integer N, returns the smallest integer greater than N, the sum of whose digits is twice as big as the
sum of digits of N.

Examples:
1. Given N = 14, the function should return 19. The sum of digits of 19 (1 + 9 = 10) is twice as big as sum of digits of
14 (1 + 4 = 5).
2. Given N = 10, the function should return 11.
3. Given N = 99, the function should return 9999.

Assume that:
• N is an integer within the range (1..500).

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class DoubleDigitSum {
    public int solution(int N) {
        int initSum = digitsSum(N);
        int targetSum = initSum * 2;
        int newNum = N+1;

        //keep incrementing newNum until targetSum reached
        while (true) {
            if (digitsSum(newNum) != targetSum) {
                newNum++;
            }
            else {
                return newNum;
            }
        }
    }

    private int digitsSum(int num) {
        String numString = "" + num;
        int sum = 0;

        for (int i = 0; i < numString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }

        return sum;
    }

    public static void main(String[] args) {
        DoubleDigitSum doubleDigitSum = new DoubleDigitSum();
        System.out.println(doubleDigitSum.solution(14));
        System.out.println(doubleDigitSum.solution(10));
        System.out.println(doubleDigitSum.solution(99));
        System.out.println(doubleDigitSum.solution(9));
        System.out.println(doubleDigitSum.solution(100));
    }
}
