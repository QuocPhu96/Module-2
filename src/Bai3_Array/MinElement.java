package Bai3_Array;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int[][] array = new  int[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++){
                System.out.println("nhập giá tr mảng 2 chiều vài : ");
                array[i][j] = scanner.nextInt();
            }
        }

        int min = array[0][0];
        for (int i = 0; i  < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if(array[i][j] > min){
                    min = array[i][j];
                }
            }
        }
        System.out.println("giá trị nhỏ nhất là : " + min);
    }
}
