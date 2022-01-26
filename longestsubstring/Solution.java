package longestsubstring;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        while (j < s.length()){
            i = j;
            HashSet<Character> hashSet = new HashSet<>();
            while (i < s.length()  && !hashSet.contains(s.charAt(i)) ){
                hashSet.add(s.charAt(i));
                i++;
            }
            max = Math.max(max, hashSet.size());
            j++;
        }
        return max;
    }
}