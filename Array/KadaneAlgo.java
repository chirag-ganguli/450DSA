// Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

public class KadaneAlgo {

    static int Kadane(int arr[], int size) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for(int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + arr[i];

            if(maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }

            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 5, 6, -3};
        int n = arr.length;
        System.out.print("Max Sub Array Sum: " + Kadane(arr, n));
    }
}