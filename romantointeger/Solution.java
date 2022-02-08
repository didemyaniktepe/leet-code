package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Character, Integer> romans = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (romans.get(s.charAt(i)) >= romans.get(s.charAt(i + 1))) {
                number += romans.get(s.charAt(i));
            } else {
                number -= romans.get(s.charAt(i));
            }
        }
        number += romans.get(s.charAt(s.length() - 1));
        return number;
    }

}
