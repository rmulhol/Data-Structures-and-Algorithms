package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class mergeSortTest {
    mergeSort testObject = new mergeSort();

    @Test
    public void mySortImplementsMergeSort() {
        Comparable[] unsortedArray = new Integer[]{10, 5, 9, 4, 8, 3, 7, 2, 6, 1};
        Comparable[] sortedArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Comparable[] returnedArray = testObject.mySort(unsortedArray);

        assertArrayEquals(sortedArray, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfThreeIntegers() {
        Comparable[] unsortedIntegers = new Integer[]{9, 1, 2};
        Comparable[] sortedIntegers = new Integer[]{1, 2, 9};
        Comparable[] returnedArray = testObject.mergeSort(unsortedIntegers, 0, 2);

        assertArrayEquals(sortedIntegers, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfSixIntegers() {
        Comparable[] unsortedIntegers = new Integer[]{6, 3, 1, 4, 5, 2};
        Comparable[] sortedIntegers = new Integer[]{1, 2, 3, 4, 5, 6};
        Comparable[] returnedArray = testObject.mergeSort(unsortedIntegers, 0, 5);

        assertArrayEquals(sortedIntegers, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfTenIntegers() {
        Comparable[] unsortedIntegers = new Integer[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        Comparable[] sortedIntegers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Comparable[] returnedArray = testObject.mergeSort(unsortedIntegers, 0, 9);

        assertArrayEquals(sortedIntegers, returnedArray);
    }

    @Test
    public void mergeSortSortsArrayOfStrings() {
        Comparable[] unsortedStrings = new String[]{"zap", "car", "bag", "the", "pie"};
        Comparable[] sortedStrings = new String[]{"bag", "car", "pie", "the", "zap"};
        Comparable[] returnedArray = testObject.mergeSort(unsortedStrings, 0, 4);

        assertArrayEquals(sortedStrings, returnedArray);
    }

    @Test
    public void mergeSortReturnsEmptyArray() {
        Comparable[] emptyArray = new Comparable[]{};
        Comparable[] expectedArray = new Comparable[]{};
        Comparable[] returnedArray = testObject.mergeSort(emptyArray, 0, 0);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeMergesTwoIntegers() {
        Comparable[] unmergedIntegers = new Integer[]{9, 1};
        Comparable[] mergedIntegers = new Integer[]{1, 9};
        Comparable[] returnedArray = testObject.myMerge(unmergedIntegers, 0, 0, 1);

        assertArrayEquals(mergedIntegers, returnedArray);
    }

    @Test
    public void mergeMergesTwoSortedArraysOfUnevenLength() {
        Comparable[] unevenArrays = new Integer[]{1, 5, 9, 3, 7};
        Comparable[] expectedArray = new Integer[]{1, 3, 5, 7, 9};
        Comparable[] returnedArray = testObject.myMerge(unevenArrays, 0, 2, 4);

        assertArrayEquals(expectedArray, returnedArray);
    }

    @Test
    public void mergeMergesTwoSortedArraysOfFiveIntegers() {
        Comparable[] twoSortedArrays = new Integer[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        Comparable[] expectedArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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