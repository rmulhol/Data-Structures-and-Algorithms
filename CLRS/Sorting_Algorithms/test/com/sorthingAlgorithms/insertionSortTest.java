package com.sorthingAlgorithms;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class insertionSortTest {
    @Test
    public void insertionSortOrdersElements() {
        sortable testObject = new insertionSort();
        LinkedList<Integer> inputList = new LinkedList<Integer>();
        inputList.add(5);
        inputList.add(1);
        inputList.add(4);
        inputList.add(3);
        inputList.add(2);

        testObject.mySort(inputList);

        assertEquals(1, (int) inputList.get(0));
        assertEquals(2, (int) inputList.get(1));
        assertEquals(3, (int) inputList.get(2));
        assertEquals(4, (int) inputList.get(3));
        assertEquals(5, (int) inputList.get(4));
    }

    @Test
    public void insertionSortMaintainsLength() {
        sortable testObject = new insertionSort();
        LinkedList<Integer> inputList = new LinkedList<Integer>();
        inputList.add(5);
        inputList.add(1);
        inputList.add(4);
        inputList.add(3);
        inputList.add(2);
        testObject.mySort(inputList);

        assertEquals(5, inputList.size());
    }
}