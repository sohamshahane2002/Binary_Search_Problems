package BinarySearchProblems.BinarySearch4;
import java.util.*;
public class Peak_Element {
    public static int peakelement( ArrayList<Integer> arr){
        int n = arr.size();

        if(n==1) return 0;                   //if arr is  1 size
        if(arr.get(0) > arr.get(1)) return 0;        //if arr[0] greater its the peak
        if(arr.get(n-1)>arr.get(n-2)) return n - 1;  //if last element is the peak

        int low = 1 ; 
        int high = n - 2;
        while(low <= high){
            int mid = ( low + high )/2;
            if(arr.get(mid-1) < arr.get(mid) && arr.get(mid) > arr.get(mid+1)) return mid;   //if mid is peak
            if(arr.get(mid) > arr.get(mid - 1))  low = mid + 1;   //peak is on left side
            else high = mid - 1;                                //peak is on the right;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr =   new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1 ));
        System.out.println("The index of peak element is : " + peakelement(arr));
    }
}
