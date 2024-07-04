class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

         final int n = nums.length;
    int[] ans = new int[n];
    int[] prefix = new int[n];
    int[] suffix = new int[n];

    prefix[0] = nums[0];
    for (int i = 1; i < n; ++i)
      prefix[i] = prefix[i - 1] + nums[i];

    suffix[n - 1] = nums[n - 1];
    for (int i = n - 2; i >= 0; --i)
      suffix[i] = suffix[i + 1] + nums[i];

    for (int i = 0; i < nums.length; ++i) {
      final int left = nums[i] * (i + 1) - prefix[i];
      final int right = suffix[i] - nums[i] * (n - i);
      ans[i] = left + right;
    }

    return ans;
        // int [] arr=new int[nums.length];
        // int totsum=0;
        // for(int i=0;i<nums.length;i++){
        //     totsum+=nums[i];
        // }
        // int n=nums.length;
        // int leftsum=0;
        // int rightsum=0;
        // //initial.
        // int j=0;
        // rightsum=Math.abs(totsum-(n-j)*nums[j]);
        // arr[j]=leftsum+rightsum;
        // totsum=totsum-nums[j];
        
        // for(int i=1;i<nums.length;i++){
        //     leftsum+=nums[i-1];
        //     int lt=Math.abs(nums[i]-leftsum*i);
        //     int rt=Math.abs(totsum-(n-i)*nums[i]);
        //     arr[i]=lt+rt;
        //     totsum=totsum-arr[i];
        // }

        // // while(i<nums.length){
            
        // //     if(i==0){
            
        // //     rightsum=Math.abs(totsum-(n-i)*(nums[i]));
        // //     arr[i]=0+rightsum;
        // //     totsum=totsum-nums[i];
        // //     leftsum+=nums[i];
        // //     i++;
        // //     }
    
        // //     //leftsum+=nums[i];
        // //     int lftsum=Math.abs((nums[i]-leftsum)*i);
        // //      rightsum=Math.abs((totsum-(n-i)*(nums[i])));
        // //      arr[i]=lftsum+rightsum;
        // //      totsum=totsum-nums[i];
        // //      //leftsum+=nums[i];
        // //      i++;
             
        // //      //leftsum;
             
            

        // // }
        

    }
}