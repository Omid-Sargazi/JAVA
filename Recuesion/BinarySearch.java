package Recuesion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(binarySearch(arr, 4, 0, arr.length - 1));

    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] == target)
            return mid;

        else if (arr[mid] > target) {
            return binarySearch(arr, target, mid, high);
        } else {
            return binarySearch(arr, target, low, mid);
        }

    }
}
