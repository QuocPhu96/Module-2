package Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần thêm : ");
        int add;
        add = scanner.nextInt();
        System.out.println("nhập vị trí thêm : ");
        int location;
        location = scanner.nextInt();

        for (int i = 0; i < array.length; i++){
            if (location == i){
                for (int j = array.length -1;j > i;j--){
                    array[j] = array[j - 1];
                }
                array[i] = add;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
