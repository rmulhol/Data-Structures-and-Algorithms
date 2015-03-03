package com.sorthingAlgorithms;

public class heapSort implements sortable {
    public int heapSize;

    @Override
    public Comparable[] mySort(Comparable[] list) {
        heapSort(list);
        return list;
    }

    public void heapSort(Comparable[] simpleArray) {
        buildMaxHeap(simpleArray);
        for(int i = simpleArray.length - 1; i > 0; i--) {
            exchange(simpleArray, i, 0);
            this.heapSize = this.heapSize - 1;
            maxHeapify(simpleArray, 0);
        }
    }

    public void buildMaxHeap(Comparable[] simpleArray) {
        this.heapSize = simpleArray.length;
        for(int i = this.heapSize / 2; i >= 0; i--) {
            maxHeapify(simpleArray, i);
        }
    }

    public void maxHeapify(Comparable[] simpleArray, int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest;
        if(left < this.heapSize && simpleArray[left].compareTo(simpleArray[i]) > 0) {
            largest = left;
        } else {
            largest = i;
        }
        if(right < this.heapSize && simpleArray[right].compareTo(simpleArray[largest]) > 0) {
            largest = right;
        }
        if(largest != i) {
            exchange(simpleArray, largest, i);
            maxHeapify(simpleArray, largest);
        }
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int leftChild(int i) {
        return 2 * i + 1;
    }

    public int rightChild(int i) {
        return 2 * i + 2;
    }

    public void exchange(Comparable[] simpleArray, int i, int j) {
        Comparable placeholder = simpleArray[i];
        simpleArray[i] = simpleArray[j];
        simpleArray[j] = placeholder;
    }
}
