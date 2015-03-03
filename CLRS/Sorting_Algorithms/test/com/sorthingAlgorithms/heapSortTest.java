package com.sorthingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class heapSortTest {

    private heapSort testObject = new heapSort();

    @Test
    public void mySortImplementsHeapSort() {
        Comparable[] unsortedArray = new Integer[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        Comparable[] sortedArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Comparable[] returnedArray = testObject.mySort(unsortedArray);

        assertArrayEquals(sortedArray, returnedArray);
    }

    @Test
    public void parentReturnsParentNodeForIndex1() {
        assertEquals(0, testObject.parent(1));
    }

    @Test
    public void parentReturnsParentNodeForIndex3() {
        assertEquals(1, testObject.parent(3));
    }

    @Test
    public void parentReturnsParentNodeForIndex5() {
        assertEquals(2, testObject.parent(5));
    }

    @Test
    public void leftChildReturnsLeftChildForIndex0() {
        assertEquals(1, testObject.leftChild(0));
    }

    @Test
    public void leftChildReturnsLeftChildForIndex1() {
        assertEquals(3, testObject.leftChild(1));
    }

    @Test
    public void leftChildReturnsLeftChildForIndex2() {
        assertEquals(5, testObject.leftChild(2));
    }

    @Test
    public void rightChildReturnsRightChildForIndex0() {
        assertEquals(2, testObject.rightChild(0));
    }

    @Test
    public void rightChildReturnsRightChildForIndex1() {
        assertEquals(4, testObject.rightChild(1));
    }

    @Test
    public void rightChildReturnsRightChildForIndex2() {
        assertEquals(6, testObject.rightChild(2));
    }

    @Test
    public void heapSortSortsArrayOf3Elements() {
        Integer[] unsortedArray = new Integer[]{3, 2, 1};
        Integer[] sortedArray = new Integer[]{1, 2, 3};

        testObject.heapSort(unsortedArray);

        assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    public void heapSortSortsArrayOf5Elements() {
        Integer[] unsortedArray = new Integer[]{5, 1, 4, 3, 2};
        Integer[] sortedArray = new Integer[]{1, 2, 3, 4, 5};

        testObject.heapSort(unsortedArray);

        assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    public void heapSortSortsArrayOf7Elements() {
        Integer[] unsortedArray = new Integer[]{7, 1, 6, 2, 5, 3, 4};
        Integer[] sortedArray = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        testObject.heapSort(unsortedArray);

        assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    public void heapSortSortsStrings() {
        String[] unsortedStrings = new String[]{"zoo", "boat", "house", "car", "life"};
        String[] sortedStrings = new String[]{"boat", "car", "house", "life", "zoo"};

        testObject.heapSort(unsortedStrings);

        assertArrayEquals(sortedStrings, unsortedStrings);
    }

    @Test
    public void buildMaxHeapBuildsHeapOf2Elements() {
        Integer[] twoElementArray = new Integer[]{1, 2};
        Integer[] arrayAsMaxHeap = new Integer[]{2, 1};

        testObject.buildMaxHeap(twoElementArray);

        assertArrayEquals(arrayAsMaxHeap, twoElementArray);
    }

    @Test
    public void buildMaxHeapBuildsHeapOf3Elements() {
        Integer[] threeElementArray = new Integer[]{1, 2, 3};
        Integer[] arrayAsMaxHeap = new Integer[]{3, 2, 1};

        testObject.buildMaxHeap(threeElementArray);

        assertArrayEquals(arrayAsMaxHeap, threeElementArray);
    }

    @Test
    public void buildHeapBuildsHeapOf5Elements() {
        Integer[] fiveElementArray = new Integer[]{5, 1, 4, 3, 2};
        Integer[] arrayAsMaxHeap = new Integer[]{5, 3, 4, 1, 2};

        testObject.buildMaxHeap(fiveElementArray);

        assertArrayEquals(arrayAsMaxHeap, fiveElementArray);
    }

    @Test
    public void buildHeapBuildsHeapOf7Elements() {
        Integer[] sevenElementArray = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Integer[] arrayAsMaxHeap = new Integer[]{7, 5, 6, 4, 2, 1, 3};

        testObject.buildMaxHeap(sevenElementArray);

        assertArrayEquals(arrayAsMaxHeap, sevenElementArray);
    }

    @Test
    public void maxHeapifySinksSmallerElementsFromIndexPassedIn() {
        Integer[] nonMaxHeap = new Integer[]{1, 8, 7, 6, 5, 4, 3};
        Integer[] maxHeap = new Integer[]{8, 6, 7, 1, 5, 4, 3};

        /*  since this method is only called inside of buildMaxHeap(),
         *  which sets the initial heap size, testing maxHeapify()
         *  requires that the heap size be set manually.
         */

        testObject.heapSize = 7;
        testObject.maxHeapify(nonMaxHeap, 0);

        assertArrayEquals(maxHeap, nonMaxHeap);
    }

    @Test
    public void exchangeSwapsTwoElements() {
        Comparable[] testArray = new Integer[]{2, 1};
        Comparable[] expectedArray = new Integer[]{1, 2};
        testObject.exchange(testArray, 0, 1);

        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void exchangeDoesNotModifyOtherElements() {
        Comparable[] testArray = new Integer[]{5, 1, 4, 2, 3};
        Comparable[] expectedArray = new Integer[]{1, 5, 4, 2, 3};
        testObject.exchange(testArray, 0, 1);

        assertArrayEquals(expectedArray, testArray);
    }
}