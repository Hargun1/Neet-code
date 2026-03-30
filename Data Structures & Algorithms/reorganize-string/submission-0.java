class Solution {
    public String reorganizeString(String s) {
        int freq[] = new int[26];

        for(Character c  :s.toCharArray()){
            freq[c-'a'] += 1;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);

        for(int i = 0 ; i < 26 ; i++){
          if(freq[i] > 0)  pq.offer(new int[]{ freq[i] , i});
        }
        StringBuilder sb = new StringBuilder();
        while(pq.size() >=2){
            int[] first = pq.poll();
            int[] second = pq.poll();

            sb.append((char)(first[1] + 'a'));
            sb.append((char)(second[1] +'a'));

            first[0]--;
            second[0]--;

            if(first[0]> 0){
                pq.offer(first);
            }
            if(second[0] > 0){
                pq.offer(second);
            }
        }

        while(!pq.isEmpty()){
            int[] last = pq.poll();
            if(last[0] > 1) return "";
            sb.append((char)(last[1] +'a')); 
        }
        return sb.toString();
    }
}