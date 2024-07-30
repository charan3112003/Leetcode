class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> em:map.entrySet()){
            if(em.getValue()>=n+1){
                ans=em.getKey();
                break;
            }
        }
        return ans;
    }
}