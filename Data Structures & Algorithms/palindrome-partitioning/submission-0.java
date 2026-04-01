class Solution {
    List<List<String>> ans  = new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s, new ArrayList<>() , 0);
        return ans;
    }
  public void  helper(String s  , List<String> ls , int idx  ){
        if(idx == s.length()){
            ans.add(new ArrayList(ls));
            return;
        }
        for(int  i = idx ; i < s.length() ; i++ ){
            if(pali(s,idx,i)){
                ls.add(s.substring(idx , i + 1));
                helper(s,ls,i +1);
                ls.remove(ls.size()-1);
            }
        }

    }
    public boolean pali(String st , int s , int e){
        while(s < e){
            if(st.charAt(s) != st.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
