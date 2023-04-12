package bai2;

import java.util.Scanner;

public class Greatest_divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a : ");
        int a;
        a = scanner.nextInt();
        a = Math.abs(a);
        System.out.println("nhạp số b : ");
        int b;
        b = scanner.nextInt();
        b = Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("a và b không có ước chung");
        }
        while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất là : " + a);
    }
}
