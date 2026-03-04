import java.util.Arrays;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        int find = 78;
        int[] arr = { 1, 5, 3, 56, 12, 43, 12, 78, 100, 81, 4, 6, 7, 2 };
        Arrays.sort(arr);
        // Linear
        linear(arr, find);
        // Display all
        display(arr);
        // Binary Search
        binarySearch(arr, find);
        insert(arr);
        display(arr);
    }

    public static void linear(int[] arr, int find) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                found = true;
                System.out.println("Index of " + find + " is " + i);
            }
        }
        if (!found)
            System.out.println(find + " not found");
    }

    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void binarySearch(int[] arr, int find) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        boolean found = false;
        while (max > min) {
            mid = (max - min) / 2;
            if (arr[mid] == find) {
                found = true;
                System.out.println("Index of " + find + " is " + mid);
            } else if (arr[mid] > find) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        if (!found)
            System.out.println(find + " not found");
    }

    public static void insert(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int j = i -1;
            while (j >= 0) {
                if (arr[j] < n) {
                    arr[j + 1] = arr[j];
                    arr[j] = n;
                    j--;
                } else {
                    break;
                }
            }
        }
    }
}