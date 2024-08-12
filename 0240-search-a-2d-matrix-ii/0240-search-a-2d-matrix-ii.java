
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        
        while(left<m && right>=0){
            //int mid = (left+right)/2;
            //int r = mid/n;
            //int c = mid%n;
            //int temp = matrix[r][c];
            if(matrix[left][right] == target) return true;
            else if(matrix [left][right] < target)  left++;
            else right--;
        }
        return false;      
    }
}