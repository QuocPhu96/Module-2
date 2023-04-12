package Bai3_Array;

public class Min_value {
    public static void main(String[] args) {
        int[] array = {4,6,2,6,3,7,9,8};
        int minValue = min(array);
        System.out.println("giá trị nhỏ nhất là : " + minValue);
    }
    public static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
