package bai1.bai1;

import java.util.Scanner;

public class Total_weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số chiều cao : " );
        double height;
        height = scanner.nextDouble();
        System.out.println("số cân nặng : ");
        double weight;
        weight = scanner.nextDouble();
        double BMI = weight / (height * height);

        if(BMI < 18.5){
            System.out.println("thiếu cân");
        } else  if(BMI < 25.0){
            System.out.println("Bình thường");
        }else  if(BMI < 30.0){
            System.out.println("Thừa cân");
        }else {
            System.out.println("Béo phì");
        }
    }
}
