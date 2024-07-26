package BinarySearchProblems.BinarySearch1;

public class LowerBound {
    public static int lowerBound(int arr[] , int n , int target){
        int ans  = n;
        int low = 0 ;
        int high = n-1;

        while(low <= high){
            int mid = (low + high) / 2;
            
            if( arr[mid] >= target ){
                ans = mid ;
                high = mid - 1 ;
            }
            else{
                low = mid + 1 ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int arr[] =  {3, 5, 8, 15, 19};
        System.out.println("Lower Bound Index is : " + lowerBound(arr, 5 , 9));
    }
}
