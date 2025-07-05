package org.example;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            // In khoảng trắng bên trái
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // In dấu * (2*i - 1) ký tự
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Xuống dòng sau mỗi dòng in xong
            System.out.println();
        }
    }
}
