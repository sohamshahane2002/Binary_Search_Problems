//Using inbuilt function
package BinarySearchProblems.BinarySearch5;
public class Squareroot_ {

    public static int floorSqrt(int n) {
        int ans = (int) Math.sqrt(n);
        return ans;
    }

    public static void main(String[] args) {
        int n = 38;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}

