class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int left=0;
        int right=0;
        int ans=0;
        HashSet<Character> map=new HashSet<>();
        while(right<s.length()){
            char c=s.charAt(right);
            while(map.contains(c)){
                
                map.remove(s.charAt(left));
                left++; 
            }
            map.add(c);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}