package codility.easy;

/*
Write a function:
def solution(A)
that, given an array A of N integers, returns the sum of the largest odd integer and the largest even integer in A. If
there are no odd or no even integers in A, you can assume that the largest one in the corresponding group is 0 (look at
examples 3 and 4 for comparison).

Examples:
1. Given A = [5, 3, 10, 6, 11], the function should return 21. The largest odd integer is 11 and the largest even
integer is 10, so their sum is 11 + 10 = 21.
2. Given A = [20, 10, 7, 5], the function should return 27. The largest odd integer is 7 and the largest even integer is
20, so their sum is 7 + 20 = 27.
3. Given A = (7, 13, 15, 13), the function should return 15. The largest odd integer is 15. As there are no even
integers in the array, we assume the largest of them is 0.
4. Given A = [2, 6, 4, 6], the function should return 6. The largest even integer is 6. As there are no odd integers in
the array, we assume the largest of them is 0.

Write an efficient algorithm for the following assumptions:
• N is an integer within the range [1..100,000];
• each element of array A is an integer within the range [1..1,000,000,000].
 */
public class TwoMaxes {
    public int solution(int[] A) {
        int maxOdd = 0;
        int maxEven = 0;

        for (int currNum : A) {
            if (currNum % 2 != 0)
                maxOdd = Math.max(maxOdd, currNum);
            else
                maxEven = Math.max(maxEven, currNum);
        }

        return maxOdd + maxEven;
    }

    public static void main(String[] args) {
        TwoMaxes twoMaxes = new TwoMaxes();
        System.out.println(twoMaxes.solution(new int[] {5, 3, 10, 6, 11}));
        System.out.println(twoMaxes.solution(new int[] {20, 10, 7, 5}));
        System.out.println(twoMaxes.solution(new int[] {7, 13, 15, 13}));
        System.out.println(twoMaxes.solution(new int[] {2, 6, 4, 6}));
        System.out.println(twoMaxes.solution(new int[] {0, -2, 3, 1}));
    }
}
