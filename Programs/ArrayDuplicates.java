package Programs;

import java.util.Arrays;

public class ArrayDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};

        Arrays.sort(arr);

        int n = arr.length;
        int k = 0; // unique index


        for (int i = 0; i < n; i++) {
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                arr[k] = arr[i]; 
                k++;             
            }
        }

        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
