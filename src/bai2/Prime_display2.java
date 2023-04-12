package bai2;

import java.util.Scanner;

public class Prime_display2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập sô : ");

        int num;
        num = scanner.nextInt();
        int prime = 0;

        for (int i = 0; i < num; i++){
            if( i < 2){
                continue;
            }if(i == 2){
                System.out.println(i);
            }if (i > 2){
                for (int j = 2; j < i; j++){
                    if(i % j == 0){
                        prime++;
                    }
                }
                if (prime == 0){
                    System.out.println(i);
                }
                prime = 0;
            }
        }

    }
}
