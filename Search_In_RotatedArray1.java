//Binary search in element in Sorted Array (Unique elements) 
package BinarySearchProblems.BinarySearch3;
public class Search_In_RotatedArray1 {
    public static int search(int arr[] , int  n , int target){
        int low = 0;
        int high = n - 1;
        
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==target){
                return mid;
            }
            //if left sorted
            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target <= arr[mid])
                high = mid - 1;
                else 
                low = mid + 1;
            }
            //if right sorted
            else{
                if(target<=arr[high] && arr[mid]<=target)
                low = mid + 1;
                else
                high = mid - 1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int target = 0;
        int n = 8;
        int ans = search(arr, n, target);
        System.out.println("The targeted element is : " + ans );

    }
}
