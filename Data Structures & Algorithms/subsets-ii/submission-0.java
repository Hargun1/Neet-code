class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums , new ArrayList<>()  , 0 );
        return ans;
    }
    public void helper(int[] nums , ArrayList<Integer> ls , int idx){
         ans.add(new ArrayList<>(ls));
        
        for(int i = idx ; i < nums.length ; i ++){
            if( i > idx  && nums[i] == nums[i-1]){
                continue;
            }
            ls.add(nums[i]);
            helper(nums , ls , i +1);

            ls.remove(ls.size() -1);

        }
    }
}
