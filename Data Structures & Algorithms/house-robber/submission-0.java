class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0] , nums[1]);
        }

        int prev1 = 0;
        int prev2 = 0;

        for(int i = 0 ; i < nums.length ; i ++){
            int curr = Math.max(nums[i] + prev2 , prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
