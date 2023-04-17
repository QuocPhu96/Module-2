package Bai14;

import java.util.Arrays;

public class BubbleArrangement {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        for (int i = 0; i < array.length - 1; i++){
            for (int j = array.length - 1; j > i;j--){
                if (array[j] < array[j - 1]){
                    int temp = array[j];
                    array [j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
