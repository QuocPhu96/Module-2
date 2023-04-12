package bai2;

import java.util.Scanner;

public class Prime_display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lượng số nguyên tố cần tìm");
        int numbers;
        numbers = scanner.nextInt();
        int prime = 0 ;
        int count = 0 ;

        for (int i = 0; i < 1000; i++){
            if(i < 2 ){
                continue;
            }
            if (i == 2){
                System.out.println(i);
                prime++;
            }if (i > 2){
                for (int j = 2; j < i ; j++){
                    if (i % j == 0){
                        count++;
                    }
                }
                if (count == 0 && prime < numbers){
                    System.out.println(i);;
                    prime++;
                }
                count = 0;
            }
        }
        System.out.println(prime);
    }
}
