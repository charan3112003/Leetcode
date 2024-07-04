class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int len=piles.length/3;
        int c=0;
        int sum=0;
        for(int i=piles.length-1;i>=0;i=i-2){
            sum+=piles[i-1];
            c++;
            if(c==len){
                break;
            }
        }
        return sum;
    }
}