class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,new ArrayList<>(), new boolean[nums.length]);
        return list;
    }
    public void helper(int[] nums  , List<Integer> ls, boolean[] visit){
        if(ls.size() == nums.length){
            list.add(new ArrayList<>(ls));
            return;
        }
      for(int  i = 0 ; i  < nums.length ; i++){

            if(!visit[i]){

            ls.add(nums[i]);
            visit[i] = true;    
            

            helper(nums,ls,visit);

            ls.remove(ls.size() -1);
            visit[i] = false;
      }
      }

    }
}
