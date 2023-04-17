package Bai14;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 5, -6, 1, 2, 14, 12};

        int x;
        int pos;
        for (int i = 1; i < array.length;i++){
            pos = i;
            x = array[i];
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
//        int min;
//        for (int i = 0; i < array.length - 1;i++ ){
//            min = i;
//            for (int j = i + 1;j < array.length;j++){
//                if(array[j] < array[min]){
//                    min = j;
//                }
//            }
//            if (min != i){
//                int temp = array[min];
//                array[min] = array[i];
//                array[i] = temp;
//            }
//        }
        System.out.print(Arrays.toString(array));
    }
}
