class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo = 1;
        for(int w : weights){
            lo = Math.max(lo , w);
        }
        int hi = 0 ;
        for(int w : weights){
            hi += w; 
        }
    int ans = hi;
        while( lo <= hi ){
            int mid = lo + (hi - lo)/2;

            if(valid(weights , mid , days)){
                ans = mid;
               hi = mid -1 ;
            }else{
                lo = mid + 1;

            }
        }
        return lo;
    }
    public boolean valid(int [] weights , int mid , int days){
        int d = 1;
        int load = 0;
        for(int w : weights){
           if(load + w > mid){
                d++;
                load = 0;
            }
            load += w;
            
        }
        
        return d <=days;
    }
}