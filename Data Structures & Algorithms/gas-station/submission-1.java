class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr = 0;
        int total = 0;
        int start =0;

        for(int i = 0 ; i < gas.length ; i++){
            int diff = gas[i] - cost[i];

            curr += diff ;
            total += diff;

            if(curr < 0){
                start = i+1;
                curr =0;
            }
        }
        return total < 0?-1:start;
    }
}
