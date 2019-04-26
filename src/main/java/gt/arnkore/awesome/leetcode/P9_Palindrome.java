package gt.arnkore.awesome.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 *
 * Example 1:
 *   Input: 121
 *   Output: true
 *
 * Example 2:
 *   Input: -121
 *   Output: false
 *   Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
 *   Therefore it is not a palindrome.
 *
 * Example 3:
 *   Input: 10
 *   Output: false
 *   Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Follow up:
 *   Coud you solve it without converting the integer to a string?
 */
public class P9_Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        List<Integer> digits = new ArrayList<Integer>();
        int p = x;
        while (p != 0) {
            digits.add(p % 10);
            p /= 10;
        }

        int i = 0, j = digits.size() - 1;
        while (i <= j) {
            if (digits.get(i++) != digits.get(j--)) {
                return false;
            }
        }

        return true;
    }
}
