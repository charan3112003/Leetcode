class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        combine(0,c,t,new ArrayList<>(),ans);
        return ans;
    }
    public static void combine(int i,int[] arr,int k,List<Integer> l,List<List<Integer>> res){
            if(k==0){
                res.add(new ArrayList<>(l));
                return;
            }
            
        
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1]){
                continue;
            }
            if(arr[j]>k){
                break;
            }
        
            l.add(arr[j]);
            combine(j+1,arr,k-arr[j],l,res);
            l.remove(l.size()-1);
        }
        
    }
}