package com.rahul.programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

  public static void main(String[] args) {
    printAllNumbersInListFunctional(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
  }

  private static void print(int number) {
    System.out.print(number + " ");
  }

  private static void printAllNumbersInListFunctional(List<Integer> numbers) {
    numbers.stream().forEach(FP01Functional::print);
  }
}
