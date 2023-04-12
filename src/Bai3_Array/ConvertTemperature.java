package Bai3_Array;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;

        do {
            System.out.println("menu");
            System.out.println("1. Chuyển đội độ C qua độ F:");
            System.out.println("2. Chuyện đổi độ F qua độ C");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 : {
                    System.out.println("Nhập độ C :");
                    celsius = scanner.nextDouble();
                    System.out.println("Độ C sang F là" + celsiusToFahrenheit(celsius));
                }
                case 2 : {
                    System.out.println("Nhập độ F : ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Độ F sang C là : " + fahrenheitToCelsius(fahrenheit));
                }
                case 0 :
                    System.exit(0);

            }

        }while (choice != 0);

    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return  celsius;
    }
}
