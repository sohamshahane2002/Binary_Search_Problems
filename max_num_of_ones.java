package BinarySearchProblems.BinarySearch8;
import java.util.*;
public class max_num_of_ones{
        public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
            int low = 0, high = n - 1;
            int ans = n;
    
            while (low <= high) {
                int mid = (low + high) / 2;
               
                if (arr.get(mid) >= x) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1; 
                }
            }
            return ans;
        }
        public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
            int count_max = -1;
            int index = -1;
            for(int i = 0 ; i < n ; i++){
                int count_ones = m - lowerBound(matrix.get(i), m, 1);
                if(count_ones > count_max){
                    count_max = count_ones;
                    index = i;
                }
            }return index;
        }
        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
            matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
            matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
            matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

            int n = 3, m = 3;
            System.out.println("The row with the maximum number of 1's is: " +
            rowWithMax1s(matrix, n, m));
            
        }
    
}
