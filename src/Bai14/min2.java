package Bai14;

public class min2 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,6,9,3,10,9,6,10};

        int max = arr[0];
        int max1 = arr[0];

        for (int i = 1; i < arr.length;i++){
            if(arr[i] > max ){
                max1 = max;
                max = arr[i];
            }else if (arr[i] > max1 && arr[i] < max ){
                max1 =arr[i];
            }
        }
        System.out.println(max1);
    }
}
