package stringtoint;

public class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        int index = 0;
        boolean isNegative = false;
        long num = 0;

        //removing whitespaces
        while (index < len && (s.charAt(index) == ' ')) {
            index++;
        }

        //check for sign
        if (index < len && s.charAt(index) == '-') {
            index++;
            isNegative = true;
        } else if (index < len && s.charAt(index) == '+') {
            index++;
        }

        while (index < len && Character.isDigit(s.charAt(index))) {
            num = 10 * num + Character.getNumericValue(s.charAt(index++));
            if (num > Integer.MAX_VALUE) {
                num = Integer.MAX_VALUE;
                if (isNegative) {
                    num = num + 1;
                }
                break;
            }
        }


        return (int) (isNegative ? num * -1 : num);
    }

}
