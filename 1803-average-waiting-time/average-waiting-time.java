class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        double curr=0;
        double wait=0;
        for(int [] num:customers){
            curr=Math.max(curr,1.0*num[0])+num[1];
            wait+=1.0*curr-num[0];
        }
        return 1.0*wait/n;

    }
}