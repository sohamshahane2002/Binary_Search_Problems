package BinarySearchProblems.BinarySearch7;
import java.util.*;
public class AggressiveCows {
    public static boolean canWeplace(int stalls[] , int dist ,int cows){
        int  n = stalls.length;
        int cntCows = 1;
        int last = stalls[0];
        for(int i = 1 ; i < n ;i++){
            if(stalls[i]-last >= dist){
                cntCows++;
                last = stalls[i];
            }
            if (cntCows >= cows)
            return true;
        }
        return false;
    }

    public static int aggCows(int stalls[] , int k){
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1; int high = stalls[n-1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWeplace(stalls, mid, k) == true) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return high;
    }
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}
