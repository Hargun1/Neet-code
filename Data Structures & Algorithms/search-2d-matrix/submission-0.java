class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rows = matrix.length;
       int colm = matrix[0].length;

       int lo = 0;
       int hi = rows * colm -1;

       while(lo <= hi){
            int mid = lo + (hi -lo )/2 ;
            int a = mid / colm ;
            int b = mid % colm ;
            int value = matrix[a][b]; 
            if (value == target) {
                return true;
            } 
            else if (value < target) {
                lo = mid + 1;
            } 
            else {
                hi = mid - 1;
            }
       
       }
       return false;
    }
}
