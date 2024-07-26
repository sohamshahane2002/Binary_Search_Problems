package BinarySearchProblems.BinarySearch1;
public class UpperBound {

    public static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1; 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,8,11,11,11,12,12};
        int n = 10, x = 9;
        int ind = upperBound(arr, x, n);
        System.out.println("The upper bound is the index: " + ind);
    }
}

