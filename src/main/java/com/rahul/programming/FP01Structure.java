package com.rahul.programming;

import java.util.Arrays;
import java.util.List;

public class FP01Structure {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    printAllNumbersInListStructured(numbers);
    System.out.println();
    printEvenNumbersInListStructured(numbers);
  }

  private static void printAllNumbersInListStructured(List<Integer> numbers) {
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }

  private static void printEvenNumbersInListStructured(List<Integer> numbers) {
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.print(number + " ");
      }
    }
  }
}
