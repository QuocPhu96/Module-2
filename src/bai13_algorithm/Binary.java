package bai13_algorithm;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int[] lish = {1,10,20,30,40,50,60,70,80,90,100};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần tìm");
        int key;
        key = scanner.nextInt();
        System.out.println("só %d ở vị trí : " + binarySearch(lish,key));

//        System.out.println(binarySearch(lish,1));
//        System.out.println(binarySearch(lish,10));
//        System.out.println(binarySearch(lish,20));
//        System.out.println(binarySearch(lish,30));
//        System.out.println(binarySearch(lish,40));
//        System.out.println(binarySearch(lish,50));
//        System.out.println(binarySearch(lish,60));
//        System.out.println(binarySearch(lish,70));
//        System.out.println(binarySearch(lish,80));
//        System.out.println(binarySearch(lish,90));
//        System.out.println(binarySearch(lish,100));

    }
    public static int binarySearch(int[] lish, int key){
        int low = 0;
        int hight = lish.length - 1;

        while (hight >= low){
            int mid = (low + hight)/ 2;
            if(key < lish[mid])
                hight = mid - 1;
            else if(key == lish[mid])
                return mid;
            else
                low = mid + 1;

        }
        return - 1;
    }
}
