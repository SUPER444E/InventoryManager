package org.example;

public class InventoryManager {

    public static int[] inventoryDuplicates (int[] arr) {

        if (arr == null) {
            return arr;
        }

        int count = 0;
        int n = arr.length -1;

        for (int i=0; i <= n - count; i++ ) {
            if (arr[i] == 0) {
                if (i == n - count) {
                    arr[n] = 0;
                    n--;
                    break;
                }
                count++;
            }
        }
        int last = n - count;
        for (int i = last; i>= 0; i--) {
            if (arr[i] ==0) {
                arr[ i + count] = 0;
                count--;
                arr[i + count ] = 0;
            } else {
                arr[i + count] = arr[i];
            }
        }
        return arr;
    }

}
