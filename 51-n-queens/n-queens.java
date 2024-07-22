class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans =new ArrayList<>();

        char [][] mat=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]='.';
            }
        }
        solveQueen(mat,n,ans,0);
        return ans;
    }
    public static void solveQueen(char [][] mat,int n,List<List<String>> ans,int c){
        List<String> solution =new ArrayList<>();

        if(c==n){
            for(int i=0;i<n;i++){
                solution.add(new String (mat[i]));
            }
            ans.add(solution);
            return;
        }

        for(int i=0;i<n;i++){
        if(isSafe(mat,n,c,i)){
            mat[c][i]='Q';
            solveQueen(mat,n,ans,c+1);
            mat[c][i]='.';
        }}
    }
    public static boolean isSafe(char [][] mat,int n,int col,int row){
        // Check column
        for (int i = 0; i < col; i++) {
            if (mat[i][row] == 'Q') {
                return false;
            }
        }
        // Check upper left diagonal
        for (int i = col, j = row; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 'Q') {
                return false;
            }
        }
        // Check upper right diagonal
        for (int i = col, j = row; i >= 0 && j < n; i--, j++) {
            if (mat[i][j] == 'Q') {
                return false;
            }
        }
        // Check lower left diagonal
        for (int i = col, j = row; i < n && j >= 0; i++, j--) {
            if (mat[i][j] == 'Q') {
                return false;
            }
        }
        return true;
        
    }
}