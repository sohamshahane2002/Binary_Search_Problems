//Optimal : Binary Solution
package BinarySearchProblems.BinarySearch7;
public class Smallestdiv {
    public static int sumofdiv(int arr[] ,int div){
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum = (int) (sum +  Math.ceil( (double) (arr[i]) / (double) (div) ));
        }
        return sum;
    }
    public static int smallestDiv(int arr[] , int threshold){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            maxi = Math.max(maxi,arr[i]);
        }
        int low = 1 ;
        int high = maxi;
        while( low <= high){
            int mid = (low + high)/2;
            if(sumofdiv(arr, mid) <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int threshold = 8;
        int ans = smallestDiv(arr, threshold);
        System.out.println("The minimum divisor is: " + ans);
    }
}
