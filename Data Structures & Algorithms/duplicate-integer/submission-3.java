class Solution {
    public boolean hasDuplicate(int[] nums) {
     Arrays.sort(nums);
     if(nums.length==0|| nums.length==1){
        return false;
     }
     if(nums[nums.length-1]==nums[nums.length-2]){
        return true;
     }
     for(int i =0 ; i < nums.length-1 ; i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
     }   
     return false;
    }
}