package containerwithmostwater;

public class Solution {

    public int maxArea(int[] height) {
        int maxWidth = height.length - 1 , maxArea = 0;
        while (maxWidth != 0) {
            int startPoint = 0;
            int endPoint = maxWidth + startPoint;
            while (endPoint < height.length) {
                maxArea = Math.max(Math.min(height[startPoint++], height[endPoint++]) * maxWidth, maxArea);
            }
            maxWidth--;
        }

        return maxArea;
    }

    public int secondMaxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(Math.min(height[left], height[right]) * (right - left), maxArea);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }


    public static void main(String... args) {
        System.out.println(new Solution().maxArea(new int[]{2,3,4,5,18,17,6}));
    }

}
