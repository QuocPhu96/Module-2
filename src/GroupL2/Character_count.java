package GroupL2;

import java.util.Scanner;

public class Character_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một câu bất kỳ : ");

        String string;
        string = scanner.nextLine();
         int tu = 1;
         int kyTu = 0;
        for (int i = 0; i < string.length();i++){
            if(string.charAt(i) == ' '){
                tu++;
            }else {
                kyTu++;
            }
        }
        System.out.println("Số từ là :" + tu);
        System.out.println("Số ký tự là :" + kyTu);
    }
}
