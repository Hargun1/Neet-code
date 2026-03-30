class Solution {
    public boolean isPalindrome(String s) {
        String news = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int l = news.length();
        int p1 =0;
        int p2= l-1;

        while(p1<p2){
            if(news.charAt(p1)!= news.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

}
