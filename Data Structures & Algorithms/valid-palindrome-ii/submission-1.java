class Solution {
    public boolean validPalindrome(String s) {
        String sNew = s.toLowerCase();
        int p1 = 0;
        int p2 = sNew.length() - 1;

        while (p1 < p2) {
            if (sNew.charAt(p1) != sNew.charAt(p2)) {
                // try deleting left OR right character
                return helper(sNew, p1 + 1, p2) ||
                       helper(sNew, p1, p2 - 1);
            }
            p1++;
            p2--;
        }
        return true;
    }

    public boolean helper(String s, int p1, int p2) {
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
