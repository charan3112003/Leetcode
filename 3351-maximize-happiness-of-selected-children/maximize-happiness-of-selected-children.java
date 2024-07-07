class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        
        int c=0;
        long ans=0;
        int n=happiness.length;
        for(int i=n-1;i>=n-k;--i){
            ans+=Math.max(0,happiness[i]-c);
            ++c;     
        }
        return ans;
    }
}