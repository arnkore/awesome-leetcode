package gt.arnkore.awesome.leetcode;

/**
 * Problem 7
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *   Input: 123
 *   Output: 321
 *
 * Example 2:
 *   Input: -123
 *   Output: -321
 *
 * Example 3:
 *   Input: 120
 *   Output: 21
 *
 * Note:
 * 1. Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * 2. For the purpose of this problem, assume that your function returns 0
 * when the reversed integer overflows.
 */
public class P7_ReverseInteger {
    public int reverse(int x) {
        String istr = String.valueOf(x > 0 ? x : -x);
        long res = 0;
        for (int i = istr.length() - 1; i >= 0; i--) {
            char ch = istr.charAt(i);
            res = res * 10 + (ch - '0');
        }

        if (x < 0) {
            res = -res;
        }

        if ((x > 0 && res > Integer.MAX_VALUE) || (x < 0 && res < Integer.MIN_VALUE)) {
            return 0;
        }

        return (int)res;
    }
}
