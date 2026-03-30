class Solution {
    public int majorityElement(int[] nums) {
        int count =1;
        int start = nums[0];
        for(int i =0 ; i < nums.length ; i++){
            if(start == nums[i]){
                count++;
            }else{
                count--;
            }
            if(count ==0){
                start = nums[i];
                count =1;
            }

        }
        return start;
    }
}