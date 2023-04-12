package Bai3_Array;

import java.util.Scanner;

public class Greatest_value {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("nhập độ dài của mãng : ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Độ dài không vượt quá 20");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.printf("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("Property list : ");
        for (int j = 0; j < array.length;j++){
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.printf("Giá trị lớn nhất của mảng là : " + max + "nằm ở vị trí : " + index);
    }
}
