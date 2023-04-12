package Bai3_Array;

import java.util.Scanner;

public class Find_value_array {
    public static void main(String[] args) {
        String[] student = {"phu","phuc","khoa","phu2","phu3"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("vị trí bạn cần tìm : ");

        int location;
        location =  scanner.nextInt();

        if (location <= 0){
            System.out.println("nhập lại vị trí!");
        }
        for (int i = 1; i < student.length; i++){
            if(location == i){
                System.out.println(student[i - 1]);
            }
        }
        if(location > student.length - 1){
            System.out.println("không có trong danh sách");
        }
    }
}
