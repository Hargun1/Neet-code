class Solution {
    public boolean checkValidString(String s) {
        int lo = 0;
        int hi = 0;

        for(int i = 0 ; i < s.length() ; i++){
            Character ch = s.charAt(i);
            if( ch == '(' ){
                lo++;
                hi++;
            }
            else if (ch == ')'){
                lo--;
                hi--;
            }
            else if( ch == '*'){
                lo --;
                hi ++;
            }
           if( hi < 0) return false;
           if ( lo < 0) {
            lo = 0;
           }            }
        
        return lo == 0 ;
    }
}
