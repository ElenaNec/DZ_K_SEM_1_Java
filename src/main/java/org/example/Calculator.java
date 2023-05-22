package org.example;

import java.util.Scanner;

public class Calculator {
    public static Integer calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число a = ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число b = ");
        int b = scanner.nextInt();
        System.out.print("Введите перацию: \n + - 1 \n — - 2\n * - 3\n / - 4 \n");
        int operation = scanner.nextInt();
        int c;
        double f;
        if (operation == 1) {
            c = a + b;
            System.out.println(a + "+" + b + "=" + c);
        } else if (operation == 2) {
            c = a - b;
            System.out.println(a + "-" + b + "=" + c);
        } else if (operation == 3) {
            c = a * b;
            System.out.println(a + "*" + b + "=" + c);
        } else if (operation == 4) {
            f = (double) a / b;
            System.out.println(a + "/" + b + "=" + f);
        }
        return null;
    }
}
