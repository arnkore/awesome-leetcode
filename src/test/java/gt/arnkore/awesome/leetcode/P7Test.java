package gt.arnkore.awesome.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P7Test {
    @Test
    public void test() {
        P7_ReverseInteger p7 = new P7_ReverseInteger();
        Assert.assertEquals(321, p7.reverse(123));
        Assert.assertEquals(-321, p7.reverse(-123));
        Assert.assertEquals(21, p7.reverse(120));
        Assert.assertEquals(-21, p7.reverse(-120));
        Assert.assertEquals(321, p7.reverse(123));
        Assert.assertEquals(0, p7.reverse(2147483647));
        Assert.assertEquals(0, p7.reverse(-2147483648));
    }
}
