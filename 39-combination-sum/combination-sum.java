class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {

        List<List<Integer>> res=new ArrayList<>();
        combination(0,arr,t,new ArrayList<>(),res);
        return res;
    }
    public static void combination(int ind,int [] arr,int t,List<Integer>l,List<List<Integer>>ans){
        
        if(ind==arr.length){
            if(t==0){
                ans.add(new ArrayList<>(l));
            }
            return;  
        }

        if(arr[ind]<=t){
            l.add(arr[ind]);
            combination(ind,arr,t-arr[ind],l,ans);
            l.remove(l.size()-1);
        }
        combination(ind+1,arr,t,l,ans);
        
    }
}