class Solution {
    public int findLUSlength(String[] strs) {
        int n=strs.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            boolean r=true;
            for(int j=0;j<n;j++){
                if(i!=j&&issub(strs[i],strs[j])){
                    r=false;
                }
            }
            if(r){
                ans=Math.max(ans,strs[i].length());
            }
        }
        return ans;
    }
    public static boolean issub(String s1,String s2){
        int i=0;
        int j=0;
        int m=s1.length();
        while(i<m&&j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i==m;
    }
}