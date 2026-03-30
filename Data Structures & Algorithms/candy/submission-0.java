class Solution {
    public int candy(int[] rating) {
        int arr[] = new int[rating.length];
        for(int i =0; i< rating.length ; i++){
            arr[i] =1;
        }

        for(int i = 1 ;i < rating.length ; i++){
            if(rating[i]>rating[i-1]){
                arr[i] = arr[i-1] + 1;
            }
        }
        for(int i = rating.length -2 ; i >= 0 ; i--){
            if(rating[i] > rating[i+1] ){
                arr[i] = Math.max(arr[i+1]+1,arr[i]);
            }
        }
        int count =0;
        for(int c : arr){
            count+=c;
        }
        return count;
    }
}