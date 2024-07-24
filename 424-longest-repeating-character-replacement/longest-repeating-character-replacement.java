class Solution {
    public int characterReplacement(String s, int k) {
        int occur[]=new int[26];
        int left=0;
        
        int ans=0;
        int mostocuurences=0;
        for(int right=0;right<s.length();right++){
            mostocuurences=Math.max(mostocuurences,++occur[s.charAt(right)-'A']);
            if(right-left+1-mostocuurences>k){
                occur[s.charAt(left)-'A']--;

                left++;
                
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}