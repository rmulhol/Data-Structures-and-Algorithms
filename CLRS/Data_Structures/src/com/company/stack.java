package com.company;

import java.util.EmptyStackException;

public class stack {

    Comparable[] data;
    int top;

    public stack() {
        this.data = new Comparable[1];
        this.top = 0;
    }

    public stack(Comparable[] data) {
        this.data = new Comparable[1];
        this.top = 0;
        for (Comparable aData : data) push(aData);
    }

    public void push(Comparable item) {
        if(this.top == this.data.length) doubleArrayLength();
        this.data[this.top++] = item;
    }

    public Comparable pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            Comparable poppedData = this.data[--this.top];
            this.data[this.top] = null;
            if(this.top < this.data.length / 4 && this.top != 0) halveArrayLength();
            return poppedData;
        }
    }

    // private
    public boolean isEmpty() {
        return this.top == 0;
    }

    // private
    public void doubleArrayLength() {
        Comparable[] copy = new Comparable[this.data.length * 2];
        System.arraycopy(this.data, 0, copy, 0, this.top);
        this.data = copy;
    }

    // private
    public void halveArrayLength() {
        Comparable[] copy = new Comparable[this.data.length / 2];
        System.arraycopy(this.data, 0, copy, 0, this.top);
        this.data = copy;
    }
}
