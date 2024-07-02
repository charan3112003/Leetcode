class Solution {
    public int islandPerimeter(int[][] grid) {
      int n=grid.length;
      int peri=0;
      int up,down,left,right;
      for(int r=0;r<n;r++){
        for(int c=0;c<grid[0].length;c++){
            if(grid[r][c]==1){
                peri+=4;
                if(r>0&&grid[r-1][c]==1){
                    peri=peri-2;
                }
                if(c>0&&grid[r][c-1]==1){
                    peri=peri-2;
                }
            }
            
        }}
        return peri;
      }
    }
