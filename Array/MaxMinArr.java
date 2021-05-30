// Find  Maximum and Minimum Element in an array

public class MaxMinArr {
    
    static class Pair {
        int max;
        int min;
    }

    static Pair getMaxMin(int arr[], int n) {
        Pair MaxMin = new Pair();
        int i;
        if(n == 1) {
            MaxMin.max = arr[0];
            MaxMin.min = arr[0];
            return MaxMin;
        }
        if(arr[0] > arr[1]) {
            MaxMin.max = arr[0];
            MaxMin.min = arr[1];
        } else {
            MaxMin.max = arr[1];
            MaxMin.min = arr[0];
        }

        for(i=2; i<n; i++) {
            if(arr[i] > MaxMin.max) {
                MaxMin.max = arr[i];
            } else if (arr[i] < MaxMin.min) {
                MaxMin.min = arr[i];
            }
        }
        return MaxMin;
    }

    public static void main(String[] args) {
        int arr[] = {43, 56, 78, 91, 12};
        int arr_size = 5;
        Pair MaxMin = getMaxMin(arr, arr_size);

        System.out.println("Max: " + MaxMin.max);
        System.out.println("Min: " + MaxMin.min);
    }
}