class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     // edge case: empty matrix
    if (matrix == null || matrix.length == 0) {
        return false;
    }

    int m = matrix.length;
    int n = matrix[0].length;

    // binary search for the row
    int left = 0;
    int right = m - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (matrix[mid][0] <= target && target <= matrix[mid][n - 1]) {
            // found the row, perform binary search on the row
            int rowLeft = 0;
            int rowRight = n - 1;
            while (rowLeft <= rowRight) {
                int rowMid = rowLeft + (rowRight - rowLeft) / 2;
                if (matrix[mid][rowMid] == target) {
                    return true;
                } else if (matrix[mid][rowMid] < target) {
                    rowLeft = rowMid + 1;
                } else {
                    rowRight = rowMid - 1;
                }
            }
            return false;
        } else if (matrix[mid][0] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return false;   
    }
}