package gt.arnkore.awesome.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P8Test {
    @Test
    public void test() {
        P8_Atoi p8 = new P8_Atoi();
        Assert.assertEquals(42, p8.myAtoi("42"));
        Assert.assertEquals(-42, p8.myAtoi("   -42"));
        Assert.assertEquals(4193, p8.myAtoi("4193 with words"));
        Assert.assertEquals(0, p8.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, p8.myAtoi("-91283472332"));
        Assert.assertEquals(12345678, p8.myAtoi("  0000000000012345678"));
        Assert.assertEquals(0, p8.myAtoi("+-2"));
        Assert.assertEquals(-2, p8.myAtoi("-2 32"));
    }
}
