class Solution {
    List<String> ans  = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper("" , 0 , 0 , n );
        return ans;
    }
    public void helper(String p , int open , int close , int n){
        if(open == n && close == n){
            ans.add(new String(p));
            return;
        }
        if(open > close){
            helper(p+")" , open , close + 1 , n);
            
        }
        if(open < n ){
            helper(p + "(" , open + 1 , close , n );
        }
    }
}