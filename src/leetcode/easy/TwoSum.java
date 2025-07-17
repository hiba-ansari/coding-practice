package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109

Only one valid answer exists.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (numsMap.containsKey(difference)) {
                return new int[]{i, numsMap.get(difference)};
            }

            numsMap.put(nums[i], i);
        }
        return null;
    }

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2PointerDS(int[] nums, int target) {
        int[][] indexedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i;
        }

        Arrays.sort(indexedNums, Comparator.comparingInt(a -> a[0]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = indexedNums[left][0] + indexedNums[right][0];
            if (sum == target) {
                return new int[]{indexedNums[left][1], indexedNums[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15, 9, 0, 4, 1}, 3)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{0, 10, 10}, 10)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{-3, -1, 8, 30, -2}, -4)));
        System.out.println(Arrays.toString(twoSum.twoSum2PointerDS(new int[]{-3, -1, 8, 30, -2}, -4)));
    }
}
