class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int ans[] = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = 0;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1 ; i < nums.length ; i++ ){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                
            
                   int a =  stack.pop();
                    ans[a] = i - a ;
                    
                
            }
                stack.push(i);
            
        }
        return ans;
    }
}
