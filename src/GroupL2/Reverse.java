package GroupL2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("số cần đảo ngược :");
        int n;
        int soCuoi = 0, soDaoNguoc = 0;
        n = scanner.nextInt();

        while (n > 0) {
            soCuoi = n % 10;
            soDaoNguoc = soDaoNguoc * 10 + soCuoi;
            n = n / 10;
        }
        System.out.printf("số đảo ngược của n :" + soDaoNguoc);
        }
    }

