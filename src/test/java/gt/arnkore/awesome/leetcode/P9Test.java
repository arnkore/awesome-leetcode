package gt.arnkore.awesome.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P9Test {
    @Test
    public void test() {
        P9_Palindrome p9 = new P9_Palindrome();
        Assert.assertTrue(p9.isPalindrome(121));
        Assert.assertFalse(p9.isPalindrome(-121));
        Assert.assertFalse(p9.isPalindrome(120));
        Assert.assertFalse(p9.isPalindrome(10));
        Assert.assertTrue(p9.isPalindrome(11));
        Assert.assertTrue(p9.isPalindrome(1));
    }
}
