package BinarySearchProblems.BinarySearch8;
public class PeakElein2dmat {
    public static int findMaxIndex(int[][] mat, int n, int m, int col) {
        int maxValue = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxValue) {
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int maxRowIndex = findMaxIndex(mat, n, m, mid);
            int left = mid > 0 ? mat[maxRowIndex][mid - 1] : -1;
            int right = mid < m - 1 ? mat[maxRowIndex][mid + 1] : -1;

            if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
                return new int[]{maxRowIndex, mid};
            } else if (mat[maxRowIndex][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 4, 3, 2},
                {7, 8, 5, 9},
                {3, 2, 6, 1}
        };
        int[] peak = findPeakGrid(mat);
        System.out.println("Peak element is at: (" + peak[0] + ", " + peak[1] + ")");
    }
}


