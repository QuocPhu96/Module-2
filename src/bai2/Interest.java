package bai2;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số tiền gửi : ");
        double money ;
        money = scanner.nextDouble();
        System.out.println("Số tháng gửi : ");
        int month;
        month = scanner.nextInt();
        System.out.println("tỉ lệ lãi xuât : ");
        double interest;
        interest = scanner.nextDouble();
        double profitAmount = 0.0;
        if (money < 0){
            System.out.println("Vui lòng nhập lại số tiền!");
        }else {
            profitAmount = money * (interest * 100) / 12 *month;
        }
        System.out.println("lãi xuất bạn là : " + profitAmount);
    }
}
