//Brute force:
package BinarySearchProblems.BinarySearch7;
public class Smallestdiv_{
    public static int smallestdiv(int arr[] , int threshold){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n ;i++){
            maxi = Math.max(maxi,arr[i]);
        }

        for(int d = 1 ; d <= maxi ; d++){
            int sum = 0;
            for(int i = 0 ; i < n ; i++ ){
                sum +=  Math.ceil ((double)(arr[i]) / (double)(d) );   
            } 
            if(sum <= threshold) return d; 

        } return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int threshold = 8;
        int ans = smallestdiv(arr, threshold);
        System.out.println("The minimum divisor is: " + ans);
    }
}
