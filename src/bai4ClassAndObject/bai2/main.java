package bai4ClassAndObject.bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("nhập a : ");
        double a = number.nextDouble();
        System.out.println("nhập b : ");
        double b = number.nextDouble();
        System.out.println("Nhập c : ");
        double c = number.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getDental());
        System.out.println(quadraticEquation.getRoot());
    }
}
