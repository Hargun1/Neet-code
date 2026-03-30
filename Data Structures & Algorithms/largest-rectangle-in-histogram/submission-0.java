class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int right[] = new int[n];
        int left[] = new int[n];

        for(int i  = 0 ; i < n ; i ++){
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
               left[i] = i + 1;
            }else{
             left[i] = i - stack.peek();
            }
            stack.push(i);
        }
            stack.clear();
        for(int i = n -1 ; i >= 0 ; i --){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                right[i] =  n - i;
            }else{
                right[i] = stack.peek() - i ;   
            }
            stack.push(i);
        }        
        for(int i = 0 ;  i < n ; i++){
            int width = right[i] + left[i] - 1 ; 
            ans = Math.max(width * heights[i],ans);
        }       
        return ans;
    }
}