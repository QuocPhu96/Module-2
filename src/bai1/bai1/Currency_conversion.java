package bai1.bai1;

import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giá tiền USD : ");

        int money;
        money = scanner.nextInt();

        if( money < 0){
            System.out.println("Xin nhập lại USD");
        }else if(money >= 0){
            money = money * 23000;
            System.out.println( "= " + money + " VND");
        }
    }
}
