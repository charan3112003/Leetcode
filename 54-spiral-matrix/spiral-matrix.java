class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int d=0;
        int sc=0,ec=(matrix[0].length)-1,sr=0,er=matrix.length-1;
        List<Integer>nl= new ArrayList<Integer>(100);
        while((sr<=er)&&(sc<=ec)){
            if(d==0){
        for(int i=sc;i<=ec;i++){
            nl.add(matrix[sr][i]);
        }
        sr=sr+1;
          d++;  }
        else if(d==1){
        for(int i=sr;i<=er;i++){
            nl.add(matrix[i][ec]);
        }
        ec=ec-1;
        d++;}
        else if(d==2){
        for(int i=ec;i>=sc;i--)
        {
            nl.add (matrix[er][i]);
        }
        er=er-1;
        d++;}
        else if(d==3){
        for(int i=er;i>=sr;i--){
            nl.add(matrix[i][sc]);
        }sc=sc+1;

        d=0;}}
        return nl;}
        
    }
