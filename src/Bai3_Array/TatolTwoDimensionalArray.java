package Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class TatolTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                System.out.println();
                array[i][j]= scanner.nextInt();
            }
        }

        int tatol = 0;
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if(i == j){
                    sum += array[i][j];
                }
            }
        }
        for (int i = 0; i <array.length;i++){
            tatol += array[i][i];
        }
        System.out.print(Arrays.toString(array));
        System.out.println(" : " + sum);
        System.out.println("Tổng các số đường chéo của ma trận " + tatol);
    }
}
