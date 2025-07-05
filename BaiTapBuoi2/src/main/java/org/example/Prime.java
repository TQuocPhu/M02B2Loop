package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Prime {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int number = inputNumber.nextInt();

        if(number < 2) {
            System.out.println("Khong phai so nguyen to");
        }
        else {
            boolean check = true;

            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("So " + number + " la so nguyen to");
            }
            else {
                System.out.println("So " + number + " khong la so nguyen to");
            }
        }
    }
}
