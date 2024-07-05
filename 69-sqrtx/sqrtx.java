class Solution {
    public int mySqrt(int x) {
        int n=x/2;
        if(x==0||x==1){
            return x;
        }
        while(x/n<n){         //  8/4=2<4
                              //(4+8)/4/2=1
            n=(n+x/n)/2;//x=8
            
        }
        return n;
    }
}