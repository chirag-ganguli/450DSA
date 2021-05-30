// Minimise the maximum difference between heights 

/*
Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
*/
import java.util.*;

public class MinimizeHeights {
    static int getMinDiff(int[] arr, int n, int k) {
        if(n==1){
            return 0;
        }
        Arrays.sort(arr);
        
        int result = arr[n-1] - arr[0];

        int small = arr[0] + k;
        int big = arr[n-1] - k;
        int temp = 0;

        if(small > big) {
            temp = small;
            small = big;
            big = temp;
        }

        for(int i = 1; i < n-1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            if(subtract >= small || add <= big) {
                continue;
            }

            if(big - subtract <= add - small) {
                small = subtract;
            } else {
                big = add;
            }
        }
        return Math.min(result, big -small);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 10};
        int N = arr.length;
        int K = 2;
        System.out.println("Max Diff: " + getMinDiff(arr, N, K));
    }
}

/*
int getMinDiff(int arr[], int n, int k) {
        // code here
        sort(arr, arr+n);
        int min_elem, max_elem;
        int ans = arr[n-1] - arr[0];
        
        for (int i=1 ; i<=n-1; i++){
            if (arr[i] >= k){
                max_elem = max(arr[i-1] + k, arr[n-1] - k );
                min_elem = min(arr[0] + k, arr[i] - k );
                ans = min(ans, max_elem - min_elem);
            }
            else continue;
        }
        return ans;
    }
*/