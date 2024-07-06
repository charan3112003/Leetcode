class Solution {
    public int minOperations(int[] nums) {
        int flips=0;
        for(int i=0;i<nums.length;i++){
            if(flips%2==0&&nums[i]%2==0){
                    flips++;
            }
            else if(flips%2!=0&&nums[i]%2!=0){
                flips++;
            }
        }
        return flips;
    //     if(nums[0]==0){
    //         for(int j=1;j<nums.length;j++){
    //             if(nums[j]!=0){
    //                 c++;
    //         for(int i=j;i<nums.length;i++){
    //             if(nums[i]==1){
    //                 nums[i]=0;
    //             }
    //             else if(nums[i]==0){
    //                 nums[i]=1;
    //             }
    //         }
    //         }
    //         else{
    //             continue;
    //         }
    //     }
    //     return c+1;
    //     }
    //  for(int j=0;j<nums.length;j++){
    //             if(nums[j]!=1){
    //                 c++;
    //         for(int i=j;i<nums.length;i++){
    //             if(nums[i]==1){
    //                 nums[i]=0;
    //             }
    //             else if(nums[i]==0){
    //                 nums[i]=1;
    //             }
    //         }
    //  }
    //         else{
    //             continue;
    //         }
    //     }
    //     int ans=c;
    //     return ans;
    //     }

        //System.out.println(Arrays.toString(nums)+" "+c);
       
    }
}

