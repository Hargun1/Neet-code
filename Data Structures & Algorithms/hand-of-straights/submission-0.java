class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;            
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i : hand){
            map.put(i , map.getOrDefault(i,0) + 1);
        }
        while(!map.isEmpty()){
            int first = map.firstKey();
        
         for (int i = 0; i < groupSize; i++) {

                int currentCard = first + i;

                if (!map.containsKey(currentCard)) {
                    return false;
                }
        
        map.put(currentCard, map.get(currentCard) - 1);

                if (map.get(currentCard) == 0) {
                    map.remove(currentCard);
                }
    }
    }
return true;
}}