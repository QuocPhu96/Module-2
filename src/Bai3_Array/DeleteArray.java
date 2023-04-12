package Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,6,3,9,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xoá");

        int location ;
        location = scanner.nextInt();

        for (int i = 0; i < array.length; i++){
//            location = array[i];
            if (location == array[i]){
                for (int j = i; j < array.length - 1; j++)
                    array[j] = array[j + 1];
            }
            array[array.length - 1] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
