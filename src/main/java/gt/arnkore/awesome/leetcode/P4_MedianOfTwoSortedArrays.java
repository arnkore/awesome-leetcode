package gt.arnkore.awesome.leetcode;

import java.util.Iterator;

/**
 * Problem 4
 */
public class P4_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        boolean isEven = totalLen % 2 == 0;
        int medNumber = isEven ? totalLen / 2 - 1 : totalLen / 2;
        TwoSortedArray iter = new TwoSortedArray(nums1, nums2);
        for (int k = 0; k <= medNumber - 1; k++) {
            iter.next();
        }

        if (isEven) {
            return (iter.next() + iter.next()) / 2.0;
        } else {
            return iter.next();
        }
    }

    private class TwoSortedArray implements Iterator<Integer> {
        private final int[] arr1;

        private final int[] arr2;

        private int i;

        private int j;

        public TwoSortedArray(int[] arr1, int[] arr2) {
            this.arr1 = arr1;
            this.arr2 = arr2;
        }

        public boolean hasNext() {
            return i < arr1.length || j < arr2.length;
        }

        public Integer next() {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] <= arr2[j]) {
                    return arr1[i++];
                } else {
                    return arr2[j++];
                }
            }

            if (i < arr1.length) {
                return arr1[i++];
            }

            if (j < arr2.length) {
                return arr2[j++];
            }

            // can not be here
            return -1;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
