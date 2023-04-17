package Bai3_Array;

import java.util.Scanner;

public class NumberOfStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("nhập số lượng sinh viên : ");
            size = scanner.nextInt();
            if (size > 30){
                System.out.println("không được vượt quá 30 sinh viên!");
            }
            }while (size > 30);

        array = new int[size];
        for (int i = 0; i < array.length;i++ ){
            System.out.println("nhập học sinh vào : " + (1 + i) );
            array[i] = scanner.nextInt();
        }

        int count = 0;
        System.out.println("danh sách đấu :");
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i] + "\t");
                if (array[i] >= 5 && array[i] <= 10){
                    count++;

            }
        }
        System.out.println("số sinh viên đậu : " + count);
    }
}
