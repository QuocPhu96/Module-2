package GroupL2;

import java.util.Scanner;

public class Practice_Array {
    public static void main(String[] args) {
        int[] array = new int [8];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        int max = array[0];
        int min = array[0];
        int oddNumberMax = array[0];
        int oddNumberMin = array[0];
        for(int i = 1; i < array.length; i++ ){
            if(array[i] > max){
                max = array[i];
            }if(array[i] < min){
                min = array[i];
            }if(array[i] % 2 != 0 && array[i] > oddNumberMax){
                oddNumberMax = array[i];
            }if(array[i] % 2 != 0 && array[i] < oddNumberMin){
                oddNumberMin = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(oddNumberMax);
        System.out.println(oddNumberMin);
    }
}
