class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int r = n;
        int c = n;
        boolean[][] board = new boolean[r][c];
        for(int i = 0 ; i < r ; i++){
            for(int j =0 ; j < c ; j++  ){
                board[i][j] = false;
            }
        }
        helper(board ,  0  );
        return ans;
    }
    public void helper(boolean[][] board , int r   ){
         if (r == board.length) {
            ans.add(construct(board));
            return;
        }
        for(int i = 0 ; i < board.length ; i++){
            if(valid(board , r , i )){
                board[r][i] = true;
                helper(board , r + 1  );
                board[r][i] = false;
            }
        }

    }
    public boolean valid(boolean[][] board , int r , int c){
        for(int i = 0 ; i < r ; i++){
            if(board[i][c]){
                return false;
            }
        }

        for(int  i = 1 ; i <= Math.min(r , board.length - c - 1) ; i++){
            if(board[r-i][c+i] ){
                return false;
            }
        }

        for(int i = 1 ; i <= Math.min(r,c) ; i ++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        return true;

    }
    public List<String> construct(boolean[][] board) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) sb.append('Q');
                else sb.append('.');
            }

            res.add(sb.toString());
        }

        return res;
    }
}
