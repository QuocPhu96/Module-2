package GroupL2;

import java.util.Scanner;

public class Find_Integer_oddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n :");
        int n;
        n = scanner.nextInt();
        for (int i = 0; i < n ; i++){
            if(i % 2 != 0)
                System.out.println("số lẻ n :" + i);
        }

    }
}
