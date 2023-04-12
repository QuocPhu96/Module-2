package bai2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số :");

        int number;
        number = scanner.nextInt();

        if (number == 2){
            System.out.println("là số nguyên tố");
        } else
        if(number < 2 || number % 2 == 0){
            System.out.println("không phải là số nguyên tố!");
        }else {
            System.out.println("là số nguyên tố!");
        }
    }
}
