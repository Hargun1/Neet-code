class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int j = 0 ; j <= n ; j ++){
            int count = 0;
        for(int i = 0 ; i < 32 ; i++){
            if( (1 << i & j) != 0 ){
                count ++;
            }
        }
        ans[j] = count;
        }
        return ans;
    }
}
