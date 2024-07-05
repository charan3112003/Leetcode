class Solution {
    public int subarraySum(int[] nums, int k) {
       
       Map<Integer,Integer> mp=new HashMap<>();
       mp.put(0,1);
       int prefixsum=0;
       int count=0;
       for(int i=0;i<nums.length;i++){
        prefixsum+=nums[i];
        
        if(mp.containsKey(prefixsum-k)){
            int tot=mp.get(prefixsum-k);
            count+=tot;
        }
        if(mp.containsKey(prefixsum)){
            mp.put(prefixsum,mp.get(prefixsum)+1);
        }
        else{
            mp.put(prefixsum,1);
        }
       }
       return count;
   }
}