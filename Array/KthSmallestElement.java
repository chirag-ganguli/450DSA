// Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

import java.util.*;

public class KthSmallestElement {
    static void KthSmallest(int arr[], int size, int k) {
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k: ");
        int k = sc.nextInt();
        sc.close();
        KthSmallest(arr, size, k);
    }
}
