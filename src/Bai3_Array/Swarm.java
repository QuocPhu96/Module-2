package Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Swarm {
    public static void main(String[] args) {
        int[] array1 = new int[7];
        int[] array2 = new  int[5];
        int[] array3 = new  int[array1.length + array2.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++){
            System.out.printf("");
            array1[i] = scanner.nextInt();
        }
        for (int j = 0; j < array2.length;j++){
            System.out.printf("");
            array2[j] = scanner.nextInt();
        }

        for ( int n = 0;n < array1.length;n++){
            array3[n]= array1[n];
            System.out.println(array3[n]);
        }
        for ( int m = 0;m < array2.length;m++){
//            array3[m] = array2[m];
//            System.out.println(array3[m]);
            array3[array1.length + m] = array2[m];
        }
//        System.out.print("Mảng array_3 gồm các phần tử: ");
//        for (int arr: array3) {
//        }
        System.out.print(Arrays.toString(array3));
    }
}
