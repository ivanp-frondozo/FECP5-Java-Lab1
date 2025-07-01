package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");

        float celsius = scanner.nextFloat();

        float fahrenheit = celsius * ((float)9/5) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);

    }
}