class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> li=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    li.add(1);
                }
                else{
                    int s=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    li.add(s);
                }
            }
            ans.add(li);
        }
        return ans;
    }
}