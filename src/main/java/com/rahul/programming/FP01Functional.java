package com.rahul.programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<String> names = Arrays.asList(
      "Rahul",
      "Rahi",
      "Saurabh",
      "Satendra",
      "Shubham",
      "Spring",
      "Spring Boot"
    );
    // printAllNumbersInListFunctional(numbers);
    // printEvenNumbersInListFunctional(numbers);
    // printOddNumbersInListFunctional(numbers);
    // printNamesInSeperateLine(names);
    // printOnlyNamesThatContainsSpring(names);
    // printOnlyNamesThatContainsAtLeast6Charaters(names);
    // printSquareOfEvenNumbersInListFunctional(numbers);
    // printCubeOfOddNumbersInListFunctional(numbers);
    printCharaterLengthOfNames(names);
  }

  //   private static void print(int number) {
  //     System.out.print(number + " ");
  //   }

  //   private static boolean isEven(int number) {
  //     return number%2==0;
  //   }

  private static void printAllNumbersInListFunctional(List<Integer> numbers) {
    numbers.stream().forEach(System.out::print);
  }

  private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
    numbers
      .stream()
      // .filter(FP01Functional::isEven)
      .filter(number -> number % 2 == 0)
      .forEach(System.out::print);
  }

  private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
    numbers
      .stream()
      // .filter(FP01Functional::isEven)
      .filter(number -> number % 2 == 0)
      .map(number->number*number)
      .forEach(System.out::println);
  }

  private static void printOddNumbersInListFunctional(List<Integer> numbers) {
    numbers
      .stream()
      // .filter(FP01Functional::isEven)
      .filter(number -> number % 2 != 0)
      .forEach(System.out::print);
  }

  private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
    numbers
      .stream()
      // .filter(FP01Functional::isEven)
      .filter(number -> number % 2 != 0)
      .map(number->number*number)
      .forEach(System.out::println);
  }

  private static void printNamesInSeperateLine(List<String> names) {
    names.stream().forEach(System.out::println);
  }

  private static void printOnlyNamesThatContainsSpring(List<String> names) {
    names
      .stream()
      .filter(name -> name.contains("Spring"))
      .forEach(System.out::println);
  }

  private static void printOnlyNamesThatContainsAtLeast6Charaters(
    List<String> names
  ) {
    names
      .stream()
      .filter(name -> name.length() > 6)
      .forEach(System.out::println);
  }

  private static void printCharaterLengthOfNames(
    List<String> names
  ) {
    names
      .stream()
      .map(name->name.length())
      .forEach(System.out::println);
  }
}
