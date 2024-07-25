class Solution {
    public int[] sortArray(int[] nums) {
        int s=0;
        int e=nums.length-1;
        mergesort(nums,s,e);
        return nums;
    }
    public static void mergesort(int [] nums,int s,int e){
        if(s==e){
            return;
        }
        if(s<e){
            int mid=(s+e)/2;
            mergesort(nums,s,mid);
            mergesort(nums,mid+1,e);
            merge(nums,s,mid,mid+1,e);
        }
    }
    public static void merge(int [] nums,int s1,int e1,int s2,int e2){
        int size1=e1-s1+1;
        int size2=e2-s2+1;
        int [] left=new int[size1];
        int []right=new int[size2];
        for(int i=0;i<size1;i++){
            left[i]=nums[s1+i];
        }
        for(int i=0;i<size2;i++){
            right[i]=nums[s2+i];
        }
        int lf=0;
        int rt=0;
        int t=s1;
        while(lf<left.length&&rt<right.length){
            if(left[lf]>=right[rt]){
                nums[t++]=right[rt++];
            }
            else{
                nums[t++]=left[lf++];
            }
        }
        while(lf<left.length){
            nums[t++]=left[lf++];
        }
        while(rt<right.length){
            nums[t++]=right[rt++];
        }
    }
}