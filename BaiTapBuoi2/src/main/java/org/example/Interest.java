package org.example;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        double totalMoney = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap số tiền cho vay");
        money = input.nextDouble();

        System.out.println("Nhap tỉ lệ lãi suất theo tháng");
        interestRate = input.nextDouble();

        System.out.println("Nhap số tháng cho vay");
        month = input.nextInt();

        for(int i = 0; i < month; i++){
            totalMoney += money * month * (interestRate/100)/12;
        }

        System.out.println("Tong tien sau lai suat la:" + totalMoney);
    }
}
