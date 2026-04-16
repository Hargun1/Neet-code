class Solution {
    public int[] searchRange(int[] nums, int target) {
       int a = first(nums,target, 0 , nums.length -1);
       int b = last(nums , target ,  0 , nums.length -1);

        
        return new int[]{a,b};
    }
    public int first(int[] nums , int target , int lo , int hi){
        int ans = -1 ;

        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] == target){
                ans = mid; 
                hi = mid -1;       
            }
            else if(nums[mid] < target){
                lo = mid + 1;
            }else{
                hi = mid -1;
            }
        } 
        return ans;
    }

    public int last(int[] nums , int target , int lo , int hi){
        int ans = -1;

        while(lo <= hi){
            int mid = (lo + hi) / 2;
             if(nums[mid] == target){
                ans = mid;   
                lo = mid + 1 ;     
            }
           else if(nums[mid] < target){
                lo = mid + 1;
            }else{
                hi = mid -1;
            }
        }
        return ans;
    }

}