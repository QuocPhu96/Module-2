package bai1.bai1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên : ");

        String name;
        name = scanner.nextLine();

        System.out.println("hello " + name);
    }
}
