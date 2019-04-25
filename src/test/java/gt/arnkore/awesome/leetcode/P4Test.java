package gt.arnkore.awesome.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P4Test {
    @Test
    public void test() {
        P4_MedianOfTwoSortedArrays p4 = new P4_MedianOfTwoSortedArrays();
        Assert.assertEquals(2.0, p4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0);
        Assert.assertEquals(3.0, p4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4, 5}), 0);
        Assert.assertEquals(2.5, p4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}), 0);
    }
}
