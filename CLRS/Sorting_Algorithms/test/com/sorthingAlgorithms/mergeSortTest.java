package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class mergeSortTest {
    mergeSort testObject = new mergeSort();

    @Test
    public void mergeSortSortsArrayOfThreeInts() {
        int[] threeIntArray = new int[]{9, 1, 2};
        int[] expectedArray = new int[]{1, 2, 9};

        int[] returnedArray = testObject.mySort(threeIntArray, 0, 2);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfSixInts() {
        int[] sixIntArray = new int[]{6, 3, 1, 4, 5, 2};
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6};

        int[] returnedArray = testObject.mySort(sixIntArray, 0, 5);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfTenInts() {
        int[] tenIntArray = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] returnedArray = testObject.mySort(tenIntArray, 0, 9);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeOrdersTwoInts() {
        int[] twoInts = new int[]{9, 1};
        int[] expectedArray = new int[]{1, 9};

        int[] returnedArray = testObject.myMerge(twoInts, 0, 0, 1);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeOrdersTwoSortedArraysOfUnevenLength() {
        int[] unevenArrays = new int[]{1, 5, 9, 3, 7};
        int[] expectedArray = new int[]{1, 3, 5, 7, 9};

        int[] returnedArray = testObject.myMerge(unevenArrays, 0, 2, 4);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeOrdersTwoSortedArraysOfFiveInts() {
        int[] twoSortedArrays = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] returnedArray = testObject.myMerge(twoSortedArrays, 0, 4, 9);

        assertArrayEquals(expectedArray, returnedArray);
    }
}