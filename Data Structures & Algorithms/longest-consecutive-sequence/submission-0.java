class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int max =1;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        } 

        for(int num : set){
  // checking in set because  nums can have duplicate which uses time           
            int count =1 ;
            if(!set.contains(num+1)){
        
                while(set.contains(num- count)){
                    count+=1;
                }
            max = Math.max(max,count);
            }
        }
        return max;
    }
}
