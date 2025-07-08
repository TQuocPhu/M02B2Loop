package org.example;

import java.util.Scanner;

public class _100PrimeNumberFirst {
    public boolean isPrimeNumber(long number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false; // Loại bỏ số chẵn khác 2

        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        _100PrimeNumberFirst checked = new _100PrimeNumberFirst();

//        long number;
//        System.out.print("Vui long nhap so luong so nguyen to: "); number = inputNumber.nextLong();

        int count = 0;
        long N = 0;
        while(N < 100) {
            if(checked.isPrimeNumber(N)){
                System.out.print(N + " ");
                count++;
                    if(count == 30 || count == 30*2 || count == 30*3) {
                        System.out.print("\n");
                    }
            }
            N++;
        }
    }
}
