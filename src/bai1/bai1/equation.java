package bai1.bai1;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        System.out.println("nhập tên phương trình :");
        System.out.println("cho một phương trình 'a * x + b = c', vui lòng nhập hằn số : ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a :");
        double a = scanner.nextDouble();
        System.out.println("b :");
        double b = scanner.nextDouble();
        System.out.println("c :");
        double c = scanner.nextDouble();
        int _phu;

        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("truyền phương trình với x = %f!\n", answer);
        }else {
            if(b == c){
                System.out.printf("giải pháp tất cả là x!");
            }else {
                System.out.printf("không giải pháp ");
            }
        }
    }
}
