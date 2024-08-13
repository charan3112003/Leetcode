class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }
            else{
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
        }
        int sum=0;
        boolean odd=false;
        for(Map.Entry<Character,Integer> m1:mp.entrySet()){
            int num=m1.getValue();
            if(num%2==0){
                sum+=num;
            }
            else{
                sum+=num-1;
                odd=true;
            }
        }
        if(odd){
            sum++;
            return sum;
        }
        return sum;
    }
}