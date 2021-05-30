// Move all the negative elements to one side of the array 
// Using Swapping

public class negativeOneSide {
    static void arrange(int arr[], int n) {
        int j = 0, temp;
        for(int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if(i!=j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {51, 30, -26, 23, -12};
        int n = arr.length;
        arrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}