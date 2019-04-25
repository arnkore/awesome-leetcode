package gt.arnkore.awesome.leetcode;

/**
 * Problem 5
 *
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *   Input: "babad"
 *   Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example 2:
 *   Input: "cbbd"
 *   Output: "bb"
 */
public class P5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String spStr = buildIsolationString(s);
        int[] rd = new int[spStr.length()];

        // 遍历过程中已知的最大回文子串的中心和其右边界
        int pos = 0, mx = 0;
        // 最大回文子串在原始字符串的起始位置和长度
        int startPos = 0, maxLen = 0;
        for (int i = 1; i < spStr.length(); i++) {
            rd[i] = i < mx ? Math.min(rd[2 * pos - i], mx - i) : 1;
            while ((i - rd[i]) > 0 && i + rd[i] < spStr.length() &&
                spStr.charAt(i - rd[i]) == spStr.charAt(i + rd[i])) {
                rd[i]++;
            }

            if (i + rd[i] > mx) {
                pos = i;
                mx = i + rd[i];
            }

            if (rd[i] - 1 > maxLen) {
                maxLen = rd[i] - 1;
                startPos = i;
            }
        }

        if (maxLen == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = startPos - (rd[startPos] - 1); i < startPos + rd[startPos]; i++) {
            char ch = spStr.charAt(i);
            if (ch != '#') {
                sb.append(ch);
            }
        }

        return sb.toString();
    }


    private String buildIsolationString(String s) {
        StringBuilder appendable = new StringBuilder();
        appendable.append("$#");
        for (int i = 0; i < s.length(); i++) {
            appendable.append(s.charAt(i));
            appendable.append("#");
        }

        return appendable.toString();
    }
}
