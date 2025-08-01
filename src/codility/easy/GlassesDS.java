package codility.easy;

public class GlassesDS {
    public static int solution(int N, int K) {
        int count = 0;
        long remaining = K;
        for (int i = N; i >= 1; i--) {
            if (i <= remaining) {
                remaining -= i;
                count++;
                if (remaining == 0) {
                    return count;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 8));   // Output: 2
        System.out.println(solution(4, 10));  // Output: 4
        System.out.println(solution(1, 2));   // Output: -1
        System.out.println(solution(10, 5));  // Output: 1
    }
}
