package GroupL2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n :");

        int n;
        int count = 0;
        n = scanner.nextInt();

        for (int i = 0; i < n ; i++){
            if(i <= 1) {
                continue;
            }if(i == 2){
                System.out.println(i);
            }else {
                for (int j = 2; j < i; j++){
                    if(i % j == 0){
                        count++;
                    }
                }
                if(count == 0){
                    System.out.println(i);
                }
                count = 0;
            }
        }
    }
}
