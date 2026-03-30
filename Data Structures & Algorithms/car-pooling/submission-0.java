class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[2] - b[2]));
        Arrays.sort(trips, (a,b)->(a[1]-b[1]));

        int pass = 0;

        for( int[] trip : trips){
           while(!pq.isEmpty() && pq.peek()[2] <= trip[1]){
                pass -=  pq.peek()[0];
                pq.poll();
           }
           pass += trip[0];

           if(pass > capacity){
             return false;
           }
           pq.offer(trip);


        }
        return true;
    }
}