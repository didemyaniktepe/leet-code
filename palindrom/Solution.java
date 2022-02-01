package palindrom;


public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = reverse(x, 0);
        return reversed == x;
    }

    private int reverse(int x, int temp) {
        if (x == 0)
            return temp;
        temp = (temp * 10) + (x % 10);
        return reverse(x / 10, temp);
    }

    public static void main(String... arg) {
        System.out.println(new Solution().isPalindrome(1000021));
    }
}
