class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int maxFreq = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            Character ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
             maxFreq = Math.max(maxFreq , map.get(ch));

            while(i - left + 1 - maxFreq > k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
                
            }
          
        max = Math.max(max , i - left +1);
        }
    return max;
    }
}