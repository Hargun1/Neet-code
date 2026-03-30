class Solution {
    public boolean validPalindrome(String s) {
        String sNew = s.toLowerCase();

        int p1 = 0;
        int p2 = sNew.length() - 1;

        while (p1 < p2) {
            if (sNew.charAt(p1) != sNew.charAt(p2)) {

                StringBuilder sb1 = new StringBuilder(sNew);
                sb1.deleteCharAt(p1);

                StringBuilder sb2 = new StringBuilder(sNew);
                sb2.deleteCharAt(p2);

                return helper(sb1.toString()) || helper(sb2.toString());
            }
            p1++;
            p2--;
        }
        return true;
    }

    public boolean helper(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
