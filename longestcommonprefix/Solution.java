package longestcommonprefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String s : strs) {
            prefix = findPrefix(s, prefix);
        }
        return prefix;
    }

    private String findPrefix(String s, String prefix) {
        if (prefix.length() == 0 || s.length() == 0) {
            return "";
        }

        int i = 0;
        while (i < s.length() && i < prefix.length() && s.charAt(i) == prefix.charAt(i)) {
            i++;
        }

        return prefix.substring(0, i);
    }

}
