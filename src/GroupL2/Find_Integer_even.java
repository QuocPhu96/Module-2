package GroupL2;

import java.util.Scanner;

public class Find_Integer_even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n : ");
        int n;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            if(i % 2 != 0)
                System.out.println("các số chẵn n :" + i);

        }
    }
}
