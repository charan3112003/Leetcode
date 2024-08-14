class Solution {
    public long maxAlternatingSum(int[] nums) {
       int n=nums.length;
       if(n==1){
        return 1;
       }
       int i=0;
       long ans=0;
       long currsum=0;
       while(i+1<n){
        while(i+1<n&&nums[i]<=nums[i+1]){
            i+=1;
        }
        currsum+=nums[i];
        ans=Math.max(ans,currsum);
        while(i+1<n&&nums[i]>=nums[i+1]){
            i+=1;
        }
        currsum-=nums[i];

       }
       return ans;

    }
}