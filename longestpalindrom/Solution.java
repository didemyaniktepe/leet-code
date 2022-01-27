
package longestpalindrom;

public class Solution {

    public String longestPalindrome(String s) {
        int i = 0, j;
        String longest = "";
        while (i < s.length()) {
            j = i;
            while (j < s.length()) {
                String palindrom = getPalindrom(s.substring(i, j + 1));
                if (palindrom.length() > longest.length()) {
                    longest = palindrom;
                }
                j++;
            }
            i++;
        }

        return longest;
    }

    private String getPalindrom(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        if (s.equals(reverse)) {
            return s;
        } else {
            return "";
        }
    }

    //manacher algoritm
    public static String longestPalindromicSubstring(String s) {
        char[] t = stringToCharArray(s);
        int[] p = new int[t.length];

        int center = 0, right = 0;
        for (int i = 1; i < t.length - 1; i++) {
            int mirror = 2 * center - i;

            if (right > i)
                p[i] = Math.min(right - i, p[mirror]);
            while (t[i + (1 + p[i])] == t[i - (1 + p[i])])
                p[i]++;

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        int length = 0;
        int c = 0;
        for (int i = 1; i < p.length - 1; i++) {
            if (p[i] > length) {
                length = p[i];
                c = i;
            }
        }
        return s.substring((c - 1 - length) / 2, (c - 1 + length) / 2);
    }

    private static char[] stringToCharArray(String s) {
        char[] t = new char[s.length() * 2 + 3];
        t[0] = '$';
        t[s.length() * 2 + 2] = '@';
        for (int i = 0; i < s.length(); i++) {
            t[2 * i + 1] = '#';
            t[2 * i + 2] = s.charAt(i);
        }
        t[s.length() * 2 + 1] = '#';
        return t;
    }


    // test client
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(longestPalindromicSubstring(s));
    }
}
