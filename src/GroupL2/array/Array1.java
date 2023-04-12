package GroupL2.array;

public class Array1 {
    public static void main(String[] args) {
        int[] array = new int [9];
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
        int oddNumberMax = array[1];
        int oddNumberMin = array[1];
        for(int i = 1; i < array.length; i++ ){
            if(array[i] > max){
                max = array[i];
            }if(array[i] < min){
                min = array[i];
            }
        }
        for (int j = 1; j < array.length; j += 2){
            if( array[j] > oddNumberMax){
                oddNumberMax = array[j];
            }if( array[j] < oddNumberMin){
                oddNumberMin = array[j];
            }
        }
        System.out.println("Giá trị lớn nhất : " + max);
        System.out.println("Giá trị nhỏ nhât : " +min);
        System.out.println("Giá trị lớn nhất ở vị trí lẻ : " + oddNumberMax);
        System.out.println("Giá trị nhỏ nhất ở vị trí lẻ : " + oddNumberMin);
    }
}
