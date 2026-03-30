class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = 0 ;

        for(int i = 0 ; i < piles.length ; i ++){
            hi = Math.max(hi , piles[i]);
        }
        int ans = hi;
        while(lo  <= hi){
            int mid = lo + (hi - lo) /2 ;
            if(valid(piles,mid , h )){
                ans = mid;
                hi = mid -1;
            }else{
                lo = mid +1 ;
            }
        }
        return ans;
    }
    public boolean valid(int[] piles, int speed, int h){
        int hours = 0;

        for(int p : piles){
            hours += (p + (speed - 1)) / speed;   
        }

        return hours <= h;
}
}
