class Solution {
    class pair{
        int freq;
        Character ch ;
        pair(int a , Character b){
            freq =a ;
            ch = b;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<pair> pq = new PriorityQueue<>((x,y)-> y.freq - x.freq);
        StringBuilder sb = new StringBuilder();

        if(a > 0) pq.offer(new pair(a,'a'));
        if(b > 0) pq.offer(new pair(b,'b'));
        if(c > 0) pq.offer(new pair(c,'c'));

        while(!pq.isEmpty()){
            pair first = pq.poll();
            int len = sb.length();

            if(len >= 2 && sb.charAt(len-1) == first.ch && sb.charAt(len-2)== first.ch){
               
                if(pq.isEmpty()){
                    break;
                }
                pair second = pq.poll();
                Character ch = second.ch;
                 

                sb.append(ch);
                    if(second.freq -1 > 0 )
                pq.offer(new pair(second.freq - 1 , second.ch));

                pq.offer(first); 
            }else{
           
             sb.append(first.ch);
                first.freq--;

                if(first.freq > 0)
                    pq.offer(first);
            }                        

        }
    
       return sb.toString();
    }
}