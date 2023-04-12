package Bai3_Array;

public class Reverse_Index {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int temp;
        for (int i = 0 ; i < array.length /2; i++){
             temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = temp;
        }
        System.out.println("mảng đảo ngược là :");
        for (int number : array){
            System.out.printf(number + " ");
        }
    }
}
