package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class mergeSortTest {
    mergeSort testObject = new mergeSort();

    @Test
    public void mySortSortsArrayOfIntegers() {
        Comparable[] intArray = new Integer[]{10, 5, 9, 4, 8, 3, 7, 2, 6, 1};
        Comparable[] expectedArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Comparable[] returnedArray = testObject.mySort(intArray);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mySortSortsArrayOfStrings() {
        Comparable[] stringArray = new String[]{"zap", "car", "bag", "the", "pie"};
        Comparable[] expectedArray = new String[]{"bag", "car", "pie", "the", "zap"};

        Comparable[] returnedArray = testObject.mySort(stringArray);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfThreeInts() {
        Comparable[] threeIntArray = new Comparable[]{9, 1, 2};
        Comparable[] expectedArray = new Comparable[]{1, 2, 9};

        Comparable[] returnedArray = testObject.mergeSort(threeIntArray, 0, 2);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfSixInts() {
        Comparable[] sixIntArray = new Comparable[]{6, 3, 1, 4, 5, 2};
        Comparable[] expectedArray = new Comparable[]{1, 2, 3, 4, 5, 6};

        Comparable[] returnedArray = testObject.mergeSort(sixIntArray, 0, 5);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfTenInts() {
        Comparable[] tenIntArray = new Comparable[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        Comparable[] expectedArray = new Comparable[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Comparable[] returnedArray = testObject.mergeSort(tenIntArray, 0, 9);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfStrings() {
        Comparable[] stringArray = new String[]{"zap", "car", "bag", "the", "pie"};
        Comparable[] expectedArray = new String[]{"bag", "car", "pie", "the", "zap"};

        Comparable[] returnedArray = testObject.mergeSort(stringArray, 0, 4);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeMergesTwoInts() {
        Comparable[] twoInts = new Comparable[]{9, 1};
        Comparable[] expectedArray = new Comparable[]{1, 9};

        Comparable[] returnedArray = testObject.myMerge(twoInts, 0, 0, 1);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeMergesTwoSortedArraysOfUnevenLength() {
        Comparable[] unevenArrays = new Comparable[]{1, 5, 9, 3, 7};
        Comparable[] expectedArray = new Comparable[]{1, 3, 5, 7, 9};

        Comparable[] returnedArray = testObject.myMerge(unevenArrays, 0, 2, 4);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeMergesTwoSortedArraysOfFiveInts() {
        Comparable[] twoSortedArrays = new Comparable[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        Comparable[] expectedArray = new Comparable[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Comparable[] returnedArray = testObject.myMerge(twoSortedArrays, 0, 4, 9);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeMergesTwoSortedArraysOfStrings() {
        Comparable[] stringArray = new String[]{"bag", "car", "the", "pie", "zap"};
        Comparable[] expectedArray = new String[]{"bag", "car", "pie", "the", "zap"};

        Comparable[] returnedArray = testObject.myMerge(stringArray, 0, 2, 4);

        assertArrayEquals(expectedArray, returnedArray);
    }
}