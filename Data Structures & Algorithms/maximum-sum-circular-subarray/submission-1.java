class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        
        for(int i = 0 ; i < nums.length; i++){
            if(sum< 0){
                sum= 0;
            }
            sum += nums[i];
            max = Math.max(max,sum);
        }
        if(max<0){
            return max;
        }

        int min = Integer.MAX_VALUE;
        int sumMin =0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(sumMin > 0){
                sumMin =0;
            }
            sumMin+= nums[i];
            min = Math.min(min,sumMin);
        }
        int total =0;
        for(int i = 0 ; i < nums.length ; i++){
            total += nums[i];
        }
    return Math.max(max , total - min);       
    }
}