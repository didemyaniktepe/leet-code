package reverseinteger;

public class Solution {

    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        stringBuilder.reverse();
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '-') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.insert(0, "-");
        }
        try {
            return Integer.parseInt(stringBuilder.toString());
        } catch (Exception e) {
            return 0;
        }
    }


}
