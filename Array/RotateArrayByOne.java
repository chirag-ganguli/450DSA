// Given an array, rotate the array by one position in clock-wise direction.

public class RotateArrayByOne {
    static void rotate(int arr[], int n){
        int temp = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 4, 2, 1, 3};
        int n = arr.length;
        rotate(arr,n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 public void rotate(long arr[], long n)
    {
        int temp = (int)arr[(int)n-1];
        for(int i = (int)(n-2); i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
*/