class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int index = nums[i] - 1;

            if(nums[i] != nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp ;
            }else{
                if(i != index){
                return nums[i];
               }
            }
            i++;
        }
        return -1;
    }
}
