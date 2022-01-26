package medianoftwosortedarray;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return getMedian(mergeArrays(nums1, nums2));
    }

    private int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else if (nums2[j] < nums1[i]) {
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;

    }

    private double getMedian(int[] nums) {
        int median = nums.length / 2;
        if (nums.length % 2 == 0) {
            return (nums[median] + nums[median - 1]) / 2.0;
        } else {
            return nums[median];
        }
    }

}
