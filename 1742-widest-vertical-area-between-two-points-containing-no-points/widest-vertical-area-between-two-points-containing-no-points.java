class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int [] a,int []b){
                int p=a[0];
                int q=b[0];
                if(p<q){
                    return -1;
                }
                else if(q<p){
                    return 1;
                }
                return 0;
            }
        });
         System.out.println("Sorted points:");
        for (int[] point : points) {
            System.out.println(Arrays.toString(point));
        }
         int maxWidth = 0;

        
        for (int i = 1; i < points.length; i++) {
            int width = points[i][0] - points[i - 1][0];
            if (width > maxWidth) {
                maxWidth = width;
            }
        }

        return maxWidth;
       
        
    }
}