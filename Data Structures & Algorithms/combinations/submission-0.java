class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
            helper(n,k, new ArrayList<>(),1);
            return list;
    }
    public void helper(int n , int k , List<Integer> ls , int start){

        if(k==0){
            list.add(new ArrayList<>(ls));
            return;
        }
        
        for(int i = start ; i <= n ; i ++){
           

            ls.add(i);
            helper(n , k-1 , ls , i + 1 );
            
            ls.remove(ls.size() - 1);

           // helper(n-1 , k-1 , ls);

           
        }
       
    }
}