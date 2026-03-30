public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;   // avoid overflow
            int res = guess(mid);

            if (res == 0) {
                return mid;          // correct number
            } 
            else if (res == -1) {
                high = mid - 1;      // guessed too high
            } 
            else {
                low = mid + 1;       // guessed too low
            }
        }
        return -1; // never reached
    }
}
