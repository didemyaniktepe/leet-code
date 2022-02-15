package threesum;

import java.util.*;

public class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> threeSumList = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int[] copyNums = Arrays.copyOfRange(nums, i + 1, nums.length);
            Set<List<Integer>> twoSums = twoSum(copyNums, -nums[i]);
            threeSumList.addAll(twoSums);
        }

        return threeSumList.stream().toList();
    }

    public Set<List<Integer>> twoSum(int[] array, int target) {
        Set<List<Integer>> uniquePairs = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            int difference = target - j;
            if (map.containsKey(j)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(difference);
                pair.add(j);
                pair.add(-target);
                uniquePairs.add(pair);
            } else {
                map.put(difference, j);
            }
        }
        return uniquePairs;
    }

}
