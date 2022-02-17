package lettercombinations;

import java.util.*;

public class Solution {

    Map<Character, List<String>> phoneNumber = new HashMap<>() {{
        put('2', Arrays.asList("a", "b", "c"));
        put('3', Arrays.asList("d", "e", "f"));
        put('4', Arrays.asList("g", "h", "i"));
        put('5', Arrays.asList("j", "k", "l"));
        put('6', Arrays.asList("m", "n", "o"));
        put('7', Arrays.asList("p", "q", "r", "s"));
        put('8', Arrays.asList("t", "u", "v"));
        put('9', Arrays.asList("w", "x", "y", "z"));

    }};

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits.length() == 0) {
            return combinations;
        }

        combine(combinations, digits, new StringBuilder(), 0);
        return combinations;
    }

    private void combine(List<String> combinations, String digits, StringBuilder sb, int index) {
        if (sb.length() == digits.length()) {
            combinations.add(sb.toString());
            return;
        }
        List<String> letters = phoneNumber.get(digits.charAt(index));
        for (String s : letters) {
            sb.append(s);
            combine(combinations, digits, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
