package generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<String> generateParenthesis(int n) {
        List<String> paranthesis = new ArrayList<>();
        generate(n, paranthesis, new StringBuilder(), 0, 0);
        return paranthesis;
    }

    private void generate(int n, List<String> paranthesis, StringBuilder valid, int opened, int closed) {
        if (n == closed && n == opened) {
            paranthesis.add(valid.toString());
            return;
        }

        if (opened < n) {
            valid.append('(');
            generate(n, paranthesis, valid, opened + 1, closed);
            valid.deleteCharAt(valid.length() - 1);
        }

        if (closed < opened) {
            valid.append(')');
            generate(n, paranthesis, valid, opened, closed + 1);
            valid.deleteCharAt(valid.length() - 1);
        }

    }
}
