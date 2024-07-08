class Solution {
    public int countDays(int days, int[][] meetings) {
        
        // for(int i=0;i<meetings.length-1;i++){ 
        //     for(int j=i+1;j<meetings.length;j++){  
        //     int a=meetings[i][0];
        //     if(a>meetings[j][0]){
        //         int temp1=meetings[i][0];
        //         int temp2=meetings[i][1];
        //         meetings[i][0]=meetings[j][0];
        //         meetings[i][1]=meetings[j][1];
        //         meetings[j][0]=temp1;
        //         meetings[j][1]=temp2;
        //     }   
        // }
        // }
        Arrays.sort(meetings,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[0]>b[0])return 1;
                else if(a[0]<b[0]) return -1;
                else{
                   return 0;
                }
            }

        });
        for(int i=0;i<meetings.length;i++){
            System.out.print(meetings[i][0]+" ");
            System.out.print(meetings[i][1]+" ");
            
        }
        
         int n = meetings.length;
        int ans = 0;

        // Merging intervals
        int[] current = meetings[0];
        int mergedCount = 0;
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] <= current[1]) {
                // Merge the intervals
                current[1] = Math.max(current[1], meetings[i][1]);
            } else {
                // Count the free days between the current and next interval
                ans += meetings[i][0] - current[1] - 1;
                current = meetings[i];
            }
        }

        // Free days before the first interval
        if (meetings[0][0] > 1) {
            ans += meetings[0][0] - 1;
        }

        // Free days after the last interval
        if (current[1] < days) {
            ans += days - current[1];
        }
        

        return ans;
    }
}