class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        helper( nums , 0 , target , new ArrayList<>() , 0);
        return list;
    }
    public void helper(int nums[] , int idx , int target , List<Integer> ls , int count ){
         if(idx == nums.length){
            return;
        }
        if(count > target ){
          
            return;
        }
        if(target == count){
            list.add(new ArrayList<>(ls));
            return;
        }

       
        
        ls.add(nums[idx]);
        helper( nums , idx , target , ls , count + nums[idx]);

        ls.remove(ls.size() -1 );
        
        helper( nums , idx +1   , target , ls , count );

    }
}




































