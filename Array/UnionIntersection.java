// Find Union and Intersection of 2 sorted arrays
import java.util.*;

// map stores distinct keys only. So if we insert any key appearing more than one time it gets stored only once

public class UnionIntersection {
    static void printUnion(int[] a, int n, int[] b, int m) {
        Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
        // Insert elements in hash map
        for(int i = 0; i < n; i++) {
            mp.put(a[i], i);
        }
        for(int i = 0; i < m; i++) {
            mp.put(b[i], i);
        }

        System.out.println("Union: ");
        for(Map.Entry mapElement : mp.entrySet())
        {
            System.out.print(mapElement.getKey() + " ");
        }
    }

    static void printIntersection(int a[], int n, int b[], int m) {
        int i = 0, j = 0;
        System.out.println("Intersection: ");
        while(i<n && j<m) {
            if(a[i] > b[j]) {
                j++;
            } else if(a[i] < b[j]) {
                i++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,6,5,3,2,5};
        int b[] = {6,3,2,4,1,8,0,1};
        Arrays.sort(a);
        Arrays.sort(b);
        printUnion(a, 7, b, 8);
        System.out.println();
        printIntersection(a, 7, b, 8);
    }
}
