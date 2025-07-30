package codility.easy;

public class DoubleDigitSumDS {
    public static int solution(int N) {
        int sumN = sumOfDigits(N);
        int targetSum = 2 * sumN;
        int candidate = N + 1;

        while (true) {
            int currentSum = sumOfDigits(candidate);
            if (currentSum == targetSum) {
                return candidate;
            }
            candidate++;
        }
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(14)); // 19
        System.out.println(solution(10)); // 11
        System.out.println(solution(99)); // 9999
    }
}
