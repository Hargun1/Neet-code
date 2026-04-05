class Solution {
    public int rob(int[] nums) {
         if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0] , nums[1]);
        }

       return  Math.max(dp(nums,0,nums.length - 2) , dp(nums , 1 , nums.length-1));

        
    }
    public int dp(int[] nums , int start , int end){
        int prev1 = 0;
        int prev2 = 0;

        for(int i = start ; i <= end ; i++){
            int curr = Math.max(prev2 + nums[i] , prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
