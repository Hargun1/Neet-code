class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b) -> b-a );
        int ans = 0;
        int freq[] = new int[26];

        for(Character  ch : tasks){
            freq[ch -'A'] += 1;
        }

        for(int i = 0 ; i<26 ; i++){
           if(freq[i]> 0) pq.offer(freq[i]);
        }
        int cycle = n +1;
        while(!pq.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0 ; i <n +1 ; i++){
                if(!pq.isEmpty()){
                int curr = pq.poll();
                if(curr -1 > 0){
                    temp.add(curr -1);
                 }
                }
                ans += 1;
                if(temp.isEmpty() && pq.isEmpty()){
                    break;
                }
            }
            for(int i : temp){
                pq.offer(i);
            }
        } 
    

        return ans;
  }
}
