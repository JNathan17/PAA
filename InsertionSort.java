import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int v[] = {8,5,2,7,6,1};
        System.out.println(Arrays.toString(v));
        insertionSort(v);

    }

    private static void insertionSort(int[] v){
        int x,j;
        for(int i=1; i < v.length; i++){
            x = v[i];
            j = i - 1;
            while ((j >= 0) && v[j] > x){
                v[j + 1] = v[j];
                j -= 1;
            }
            v[j+1] = x;
        }
        System.out.println(Arrays.toString(v));


    }


}
