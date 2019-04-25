package gt.arnkore.awesome.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P5Test {
    @Test
    public void test() {
        P5_LongestPalindromicSubstring p5 = new P5_LongestPalindromicSubstring();
        Assert.assertEquals("bab", p5.longestPalindrome("babad"));
        Assert.assertEquals("bb", p5.longestPalindrome("cbbd"));
        Assert.assertEquals("", p5.longestPalindrome(""));
    }
}
