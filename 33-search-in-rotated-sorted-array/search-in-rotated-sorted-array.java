class Solution {
    public int search(int[] nums, int t) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==t){
                return mid;
}
            else if(nums[l]<=nums[mid]){
                if(t>nums[mid]||t<nums[l]){
                    l=l+1;
                }
                else{
                    r=r-1;
                }
            }
            else{
                if(nums[mid]>t||nums[r]<t){
                    r=r-1;
                }
                else{
                    l=l+1;
                }
            }
        }
        return -1;
    }
}