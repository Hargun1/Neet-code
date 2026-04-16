class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        helper(nums , new  ArrayList<>() , new boolean[nums.length] , 0);
        return ans;
    }
    public void helper(int[] nums , ArrayList<Integer> ls , boolean[] visit , int idx){
        if(ls.size() == nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i = 0 ; i < nums.length ; i ++){
            if( i  > 0 && nums[i] == nums[i-1] && !visit[i-1]){
                continue;
            }
            if(!visit[i]){
                visit[i] = true;
                ls.add(nums[i]);

                helper(nums,ls,visit,idx);

                ls.remove(ls.size()-1);
                visit[i]= false;
            }
        }
    }
}