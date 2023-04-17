package Bai14;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        double[] array = {1, 9, 4.5, 6.6, 5.7, -4.5};

//        double x ;
//        int pos;
//        for (int i = 1; i < array.length;i++){
//            x = array[i];
//            pos = i;
//            while (pos > 0 && x > array[pos - 1]){
//                    array[pos] = array[pos - 1];
//                    pos--;
//
//            }
//            array[pos] = x;
//        }
        int max;
        for (int i = 0 ; i < array.length - 1;i++){
            max = i;
            for (int j = i + 1; j < array.length;j++){
                if (array[j] > array[max]){
                    max = j;
                }
            }
            if (max != i){
                double temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
