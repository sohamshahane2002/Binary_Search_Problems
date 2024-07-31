//Using binary search
package BinarySearchProblems.BinarySearch5;
public class Squareroot {
    public static int sqrtfloor(int n ){
        int low = 0 ; int high = n;
        while(low <= high){
            long mid = (low + high) / 2;
            long ans = mid * mid;
            if( ans <= n){
                low = (int )mid + 1;
            }
            else{
                high = (int)mid - 1;
            }    
            

        }return high;
    }
    public static void main(String[] args) {
        int n = 28;
        System.out.println("The Floor of SquareRoot of number " + n + " is " + sqrtfloor(n) );
    }
}
