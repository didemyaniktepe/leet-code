package constainsduplicate;

import java.util.HashMap;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numHashMap = new HashMap<>();

        for (int i : nums) {
            if (numHashMap.containsKey(i)) {
                return false;
            } else {
                numHashMap.put(i, 1);
            }
        }

        return false;
    }

}
