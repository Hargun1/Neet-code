class Solution {
    public String mergeAlternately(String word1, String word2) {
        int pivot = 0 ;
        int p1 =0;
        int p2 =0;
        int l1 = word1.length();
        int l2 = word2.length();

        StringBuilder sb = new StringBuilder(l1 + l2); 

        while( p1< l1 && p2< l2){
           
            if(pivot % 2 == 0){
                sb.append(word1.charAt(p1));
                p1++;
                pivot++;
            }else{
                sb.append(word2.charAt(p2));
                p2++;
                pivot++;
            }

        }
        while(p1<l1){
            sb.append(word1.charAt(p1));
            p1++;
        }
         while(p2<l2){
            sb.append(word2.charAt(p2));
            p2++;
        }
        return sb.toString();
    }
}