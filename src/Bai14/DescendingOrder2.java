package Bai14;

import java.util.Arrays;

public class DescendingOrder2 {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        Arrays.sort(array);

//        int max;
//        for (int  i = 0; i < array.length - 1; i++){
//            max = i;
//            for (int j = i + 1; j < array.length; j++){
//                if(array[j] > array[max]){
//                    max = j;
//                }
//            }
//            if (max != i){
//                int temp = array[max];
//                array[max] = array[i];
//                array[i] = temp;
//            }
//        }
//        int x;
//        int pos;
//        for (int i = 1; i < array.length;i++){
//            x = array[i];
//            pos = i;
//            while (pos > 0 && x > array[pos - 1]){
//                array[pos] = array[pos - 1];
//                pos--;
//            }
//            array[pos] = x;
//        }
        System.out.print(Arrays.toString(array));
    }
}
