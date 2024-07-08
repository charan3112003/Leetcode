class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        
        int c=k;
        while(q.size()!=1){
            int temp=q.remove();
            c--;
            if(c!=0){
                q.add(temp);
            }
           else if(c==0){
                c=k;
                temp=0;
            }
        }
        return q.peek();
    }
}