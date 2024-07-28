package BinarySearchProblems.BinarySearch3;

public class Search_In_RotatedArray2 {
    public static boolean search(int arr[] , int target ,int n){
        int low = 0 ,high = n -1 ;
        while( low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == target)
            return true ;
           
            if(arr[mid] == arr[low] && arr[mid] == arr[high]){
                high = high - 1 ;
                low = low + 1 ;
                continue;
            }
            //left sort part
            if(arr[low] < arr[mid]){
                if(target <= arr[mid] && target >= arr[low])       //if target fulfills
                high = mid - 1;
                else
                low = low + 1;
            }
            //right sort part
            else{
                if(target <= arr[high] && target >= arr[mid])      //if target fulfills
                low = low + 1;
                else
                high = high - 1;
            }
        }return false;
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;
        int n = 10 ;
        boolean ans = search(arr, target, n);
        if(ans==false){
            System.out.println("The element is not present");
        }
        else{
            System.out.println("The element is Present");
        }

    }
}
