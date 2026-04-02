package com.peregrine.parser;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("=== BARCODE CHECKER == ");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter EAN-13: ");

    String barcode = scanner.nextLine();

    int sum = 0;
    for (int i = 0; i < 12; ++i) {
      int digit = Character.getNumericValue(barcode.charAt(i));

      sum += (i % 2 == 0) ? digit : digit * 3;
    }

    int check_digit = Character.getNumericValue(barcode.charAt(12));
    int calculatedCheckdigit = (10 - (sum % 10)) % 10;

    System.out.println(check_digit == calculatedCheckdigit);
  }
}
