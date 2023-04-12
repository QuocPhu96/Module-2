package bai1.bai1;

import java.util.Scanner;

public class acreage {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);  //khai báo đối tượng scan

        System.out.println("Enter width :" );
        width = scanner.nextFloat();

        System.out.println("Enter height");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("area is :" + area);
    }
}
