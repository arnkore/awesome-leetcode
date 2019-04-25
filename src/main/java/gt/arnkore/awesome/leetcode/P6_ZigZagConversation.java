package gt.arnkore.awesome.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 6: ZigZag Conversion
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 * Example 1:
 *  Input: s = "PAYPALISHIRING", numRows = 3
 *  Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 *  Input: s = "PAYPALISHIRING", numRows = 4
 *  Output: "PINALSIGYAHRPI"
 *  Explanation:
 *      P     I    N
 *      A   L S  I G
 *      Y A   H R
 *      P     I
 */
public class P6_ZigZagConversation {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> sbList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            sbList.add(new StringBuilder());
        }

        boolean down = true;
        int listIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            StringBuilder subSb = sbList.get(down ? ++listIndex : --listIndex);
            subSb.append(ch);

            // 切换方向
            if (listIndex == 0) {
                down = true;
            } else if (listIndex == numRows - 1) {
                down = false;
            }
        }

        StringBuilder resSb = new StringBuilder();
        for (StringBuilder subSb : sbList) {
            resSb.append(subSb.toString());
        }

        return resSb.toString();
    }
}
