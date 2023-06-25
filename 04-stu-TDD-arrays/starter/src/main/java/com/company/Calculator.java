package com.company;

public class Calculator {

    public int divide(int a, int b) {
        if ( b == 0 ) {
            return 0;
        }

        return a/b;
    }

    public int sumArrays(int[] a1, int[] a2){
        int sum = 0;

        for(int num : a1) {
            sum += num;
        }

        for(int num : a2) {
            sum += num;
        }

        return sum;
    }

    public int[] arrayify(int size, int start) {
        int[] out = new int[size];

        for(int i = 0; i < size; i++) {
            out[i] = start + i;
        }

        return out;
    }
}
