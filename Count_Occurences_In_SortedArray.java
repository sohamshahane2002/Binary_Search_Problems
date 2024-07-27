package BinarySearchProblems.BinarySearch2;

public class Count_Occurences_In_SortedArray {

    public static int first(int arr[], int n, int target ){
        int low = 0 ;
        int high = n -1 ;
        int first = -1 ;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid]==target){
                first = mid;
                high = mid -1 ;
            }
            else if(arr[mid] < target){
                low = mid + 1 ;
            }
            else{
                low = mid + 1 ;
            }
        }return first;
    }
    public static int last(int arr[], int n , int target){
        int low = 0 ;
        int high = n -1 ;
        int last = -1 ;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid]==target){
                last = mid;
                low = mid +1 ;
            }
            else if(arr[mid] < target){
                low = mid + 1 ;
            }
            else{
                high = mid - 1;
            }
        }return last;
    }
    public static int[] firstandlast(int[] arr, int n, int target) {
        int f = first(arr, n, target);
        int l = last(arr, n, target);
        return new int[] {f, l};
    }
    public static int count(int arr[], int n, int target) {
        int[] ans = firstandlast(arr, n, target);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,13,13,13,20,40};
        int n = 7;
        int target = 13;
        int ans = count(arr, n, target);
        System.out.println("Occurence Count is : " + ans  );

    }
}
