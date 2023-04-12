package bai2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Danh sách hc sinh");
            System.out.println("1. Nguyễn Quốc Phú ");
            System.out.println("2. Trương Ngọc Phúc");
            System.out.println("3. Nguyễn Văn Khoa");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tên: Nguyễn Quốc Phú");
                    System.out.println("Lớp: C0223G2");
                    System.out.println("Sdt: 0909999999");
                    System.out.println("gmail: phunguyen@gmail.com");
                    break;
                case 2:
                    System.out.println("Tên: Trương Ngọc Phúc");
                    System.out.println("Lớp: C0223G2");
                    System.out.println("Sdt: 080239424");
                    System.out.println("gmail: phuctruong@gmail.com");
                    break;
                case 3:
                    System.out.println("Tên: Nguyễn Văn Khoa");
                    System.out.println("Lớp: C0223G2");
                    System.out.println("Sdt: 075523523");
                    System.out.println("gmail: khoanguye@gmail.com");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không có lựa chọn!");
            }
        }
    }
}