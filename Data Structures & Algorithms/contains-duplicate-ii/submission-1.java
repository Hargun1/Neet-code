class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0){
            return false;
        }
        if(nums.length == 0 || nums.length ==1){
            return false;
        }
       HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i ++ ){
            if( set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
      return false;
    }
}