package bai1.bai1;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("năm :");

        int year;
        year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Năm" + year + "là năm nhuận");
        }else if(year % 100 == 0 && year % 400 != 0){
            System.out.println("Năm" + year + " không phải là năm nhuận");
        }else if(year % 400 == 0 && year % 100 == 0){
            System.out.println("năm" + year + "là năm nhuận");
        }else {
            System.out.println("năm" + year + "không phải là năm nhuận");
        }
    }
}

