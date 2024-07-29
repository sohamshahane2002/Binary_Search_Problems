package BinarySearchProblems.BinarySearch4;

public class SingleElements {
    public static int singleEle(int arr[]){
        int n = arr.length;
        if(n==1)
            return arr[0];
        if(arr[0]!=arr[1])
            return arr[0];
        if(arr[n-1]!=arr[n-2])
            return arr[n-1];

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
    
            // If arr[mid] is the single element:
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }
            // If arr[mid] is the single element:
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            // We are in the left:
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                    (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                // Eliminate the left half:
                low = mid + 1;
            }
            // We are in the right:
            else {
                // Eliminate the right half:
                high = mid - 1;
            }    
    }return -1;
}
public static void main(String[] args) {
    
int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans = singleEle(arr);
        System.out.println("The single element is: " + ans);
    }

}