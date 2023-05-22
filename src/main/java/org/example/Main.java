// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Вывести все простые числа от 1 до 1000

package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int sumN = 0;
        int prN = 1;

        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
            prN = prN * i;
        }

        

        System.out.println("Сумма чисел от 1 до n = " + sumN);
        System.out.println("Произведение чисел от 1 до n = " + prN);
        findPrimeNumber();

    }
    public static void findPrimeNumber(){
        for (int i = 2; i <= 1000 ; i++) {
            Integer prostN = i ;
            for (int j = 2; j < i ; j++) {
                if ( i % j == 0) {
                    prostN = null;
                    break;
                }
            }
            if (prostN != null) System.out.print(prostN + " ");
        }
    }
}