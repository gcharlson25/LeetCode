class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix[0].length * matrix.length - 1;
        while(left <= right) {
            int middle = (left + right) / 2;
            int row = middle / matrix[0].length;
            int col = middle % matrix[0].length;
            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target) {
                right = middle - 1;
            }
            else if(matrix[row][col] < target) {
                left = middle + 1;
            }            
        }
        return false;
    }
}
