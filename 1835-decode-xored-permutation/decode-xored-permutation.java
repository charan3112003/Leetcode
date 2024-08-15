class Solution {
    public int[] decode(int[] encoded) {
        int[] res=new int[encoded.length+1];
        int total=0;
        for(int i=1;i<=encoded.length+1;i++){
            total^=i;
        }
        int odd=0;
        for(int i=1;i<encoded.length;i=i+2){
            odd^=encoded[i];
        }
        int first=total^odd;
        res[0]=first;
        for(int i=0;i<encoded.length;i++){
            res[i+1]=res[i]^encoded[i];
        }
        return res;
    }}