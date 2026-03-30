class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones){
            pq.add(i);
        }

        while(!pq.isEmpty()){

            int x = pq.poll();
            if(pq.isEmpty()){
                return x;
            }
            int y = pq.poll();

            if(x > y){
                pq.add(x-y);
            }
        }
        return 0;
    }
}
