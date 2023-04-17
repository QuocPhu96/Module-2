package bai4ClassAndObject.bai1;

import java.util.Scanner;

public class main {
    public static  void main(String[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài : ");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Chu vi hình chữ nhật là : "+ rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là : "+ rectangle.getArea());
    }

}
