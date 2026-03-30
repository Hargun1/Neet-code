class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a ,b ) -> b -a);
        int ans =0;

        for(int i : nums){
            pq.add(i);
        }

        while(k > 0){
         ans =   pq.poll();
         k--;
        }

        return ans;
    }
}
