class Solution {
    public String predictPartyVictory(String senate) {
        char arr[] = senate.toCharArray();

            int r = 0;
            int d =0;

        for(char a : arr){
            if(a == 'R'){
                r++;
            }else{
                d++;
            }
        }
            int rb =0;
            int db =0;
        while( r > 0 && d > 0){
            for(int i = 0 ; i < senate.length() ; i++){
                if( arr[i] == 'R'){
                    if(db > 0){
                        db--;
                        r--;
                        arr[i] = 'x';

                    }else{
                        rb++;
                    }
                }else if (arr[i] == 'D'){
                    if(rb > 0){
                        d--;
                        rb--;
                        arr[i] = 'x';
                    }else{
                        db ++;
                    }

                }
            }
        }
        
        return r > 0 ? "Radiant":"Dire";
    
    }
}