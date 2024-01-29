package com.rahul.programming;

import java.util.Arrays;
import java.util.List;

public class FP01Structure {
    public static void main(String[] args) {
        printAllNumbersInListStructured(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for(int number:numbers){
            System.out.print(number + " ");
        }
    }
}
