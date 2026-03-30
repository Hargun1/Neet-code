class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        helper(nums , target , 0  , new ArrayList<>());
        return list;
    }
    public void helper(int[] nums , int  target , int idx , List<Integer> ls ){
        if(target == 0){
         
            list.add(new ArrayList<>(ls));
            return;
        }
     
       for(int i = idx ; i < nums.length ; i ++){
            if(i > idx && nums[i] == nums[i -1 ]){
                continue;
            }

            ls.add(nums[i]);
            helper(nums, target - nums[i] , i +1  , ls);

            ls.remove(ls.size() -1);
       }
    }
}
