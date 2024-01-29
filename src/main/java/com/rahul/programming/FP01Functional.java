package com.rahul.programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    // printAllNumbersInListFunctional(numbers);
    printEvenNumbersInListFunctional(numbers);
  }

  //   private static void print(int number) {
  //     System.out.print(number + " ");
  //   }

  private static boolean isEven(int number) {
    return number%2==0;
  }

  private static void printAllNumbersInListFunctional(List<Integer> numbers) {
    numbers.stream().forEach(System.out::print);
  }

  private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
    numbers.stream()
    .filter(FP01Functional::isEven)
    .forEach(System.out::print);
  }
}
