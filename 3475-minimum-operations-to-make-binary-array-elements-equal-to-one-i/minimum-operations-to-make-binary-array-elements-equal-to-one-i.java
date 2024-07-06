class Solution {
    public int minOperations(int[] nums) {
        int mincount=0;
        int i=0;
        int j,k;
        while(i<nums.length-2){
            if(nums[i]==0){
                mincount++;
                nums[i]=1;
                j=i+1;
                k=j+1;
                if(j<nums.length-1&&k<nums.length){
                    if(nums[j]==0&&nums[k]==0){
                        nums[j]=1;
                        nums[k]=1;
                    }
                    else if(nums[j]==1&&nums[k]==1){
                        nums[j]=0;
                        nums[k]=0;
                    }
                   else if(nums[k]==0&&nums[j]==1){
                        nums[k]=1;
                        nums[j]=0;}
                    else if(nums[k]==1&&nums[j]==0){
                        nums[k]=0;
                        nums[j]=1;
                    }   
                }
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(mincount);
        System.out.println(Arrays.toString(nums));
        int c=0;
        for(int e=0;e<nums.length;e++){
            if(nums[e]==1){
                c++;
            }
        }
        if(c==nums.length){
            return mincount;
        }
        return -1;
    }
}