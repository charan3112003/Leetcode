class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n1=nums1.length;
        int n2=nums2.length;
        // if(n1==n2){

        // }
        if(n1>=n2){
            for(int i=0;i<nums2.length;i++){
                if(!map.containsKey(nums2[i])){
                map.put(nums2[i],1);
                }
                else{
                    map.put(nums2[i],map.get(nums2[i])+1);
                }
            }
            //iterate the next array
            for(int i=0;i<nums1.length;i++){
                if(map.containsKey(nums1[i])){
                    if(map.get(nums1[i])>0){
                    arr.add(nums1[i]);
                    map.put(nums1[i],map.get(nums1[i])-1);
                    }
                }
            }
        }
        if(n2>n1){
            for(int i=0;i<nums1.length;i++){
                if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
                }
                else{
                    map.put(nums1[i],map.get(nums1[i])+1);
                }
            }
            //iterate the next array
            for(int i=0;i<nums2.length;i++){
                if(map.containsKey(nums2[i])){
                    if(map.get(nums2[i])>0){ 
                    arr.add(nums2[i]);
                    map.put(nums2[i],map.get(nums2[i])-1);
                    }
                }
            }
        }
        int size=arr.size();
        int [] ans=new int[size];
        for(int j=0;j<ans.length;j++){
            ans[j]=arr.get(j);
        }
        return ans;
    }
}