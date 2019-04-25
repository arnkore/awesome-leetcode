package gt.arnkore.awesome.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P6Test {
    @Test
    public void test() {
        P6_ZigZagConversation p6 = new P6_ZigZagConversation();
        Assert.assertEquals("PAHNAPLSIIGYIR", p6.convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", p6.convert("PAYPALISHIRING", 4));
        Assert.assertEquals("AB", p6.convert("AB", 1));
    }
}
