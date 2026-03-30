class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int  a : nums){
            min = Math.min(a , min);
        }
        return min;
    }
}
