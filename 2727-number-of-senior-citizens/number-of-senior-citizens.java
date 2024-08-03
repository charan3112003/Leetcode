class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        int [] arr=new int[details.length];
        for(int i=0;i<details.length;i++){
            String str=details[i];
            String s=str.substring(11,13);
            arr[i]=Integer.parseInt(s);
        }
        for(int i:arr){
            if(i>60){
                ans++;
            }
        }
        return ans;
    }
}