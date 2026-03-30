class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0 ;
        int ten = 0;
        for(int m : bills){
          if(m == 5){
            five++;
          }

          else if(m ==10 && five>= 1 ){
                ten++;
                five--;

            }

         else if(m == 20 && (ten >=1 && five >= 1) ){
            ten--;
            five--;
          }

          else if( m==20 &&( five >= 3)){
            five -= 3;
          }
          else return false;
        }
        return true;
    }
}