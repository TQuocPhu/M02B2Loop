package org.example;

import java.util.Scanner;

public class PrimeNumberFirst {

    public boolean isPrime(long number) {
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
        PrimeNumberFirst checked = new PrimeNumberFirst();

        int number;
        System.out.print("Vui long nhap so luong so nguyen to: "); number = inputNumber.nextInt();

        int count = 0;
        long N = 0;
        while(count < number) {
            if(checked.isPrime(N)){
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
