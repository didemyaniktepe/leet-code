package validparantheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    Map<Character, Character> paranthesesMap = new HashMap<>() {{
        put(')', '(');
        put(']', '[');
        put('}', '{');
    }};

    public boolean isValid(String s) {
        Stack<Character> paranthesesStack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (!paranthesesStack.empty() && paranthesesMap.get(character) == paranthesesStack.peek()) {
                paranthesesStack.pop();
            } else {
                paranthesesStack.push(character);
            }
        }

        return paranthesesStack.size() == 0;
    }

}
