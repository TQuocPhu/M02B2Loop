package org.example;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a, b;
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        a = inputNumber.nextInt();

        System.out.println("Nhap so b: ");
        b = inputNumber.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0 || b == 0) {
            System.out.println("Khong co uoc chung lon nhat");
        } else{
//        Nếu a chia hết cho b, thì GCD(a, b) = b.
//
//        Nếu không, thì GCD(a, b) = GCD(b, a % b)
//        Ta lặp lại việc lấy phần dư cho đến khi phần dư bằng 0.

        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("UCLN của a, b là: " + a);
        }
    }
}
