class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=0;i<points.length-1;i++){
            int j=i+1;
               int x= Math.abs(points[j][0]-points[i][0]);
               int y=Math.abs(points[j][1]-points[i][1]);
               ans+=Math.max(x,y);

            
        }
        return ans;
    }
}