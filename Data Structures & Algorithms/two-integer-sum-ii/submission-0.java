class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int p2 =numbers.length-1;
        int p1=0;

    while(p1<p2){
        if(numbers[p1]+numbers[p2]== target){
            return new int[]{p1+1,p2+1};
        }

        if(numbers[p1]+numbers[p2]< target){
            p1++;
        }
        else{
            p2--;
        }
    }
    
    return new int[]{-1,-1};
    
    }
}
