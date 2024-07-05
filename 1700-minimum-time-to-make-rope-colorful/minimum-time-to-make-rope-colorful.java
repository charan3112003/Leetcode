
class Solution {
  public int minCost(String colors, int[] neededTime) {
    int ans = 0;
    int maxNeededTime = neededTime[0];

    for (int i = 1; i < colors.length(); ++i)
      if (colors.charAt(i) == colors.charAt(i - 1)) {
        ans += Math.min(maxNeededTime, neededTime[i]);
        maxNeededTime = Math.max(maxNeededTime, neededTime[i]);
      } else {
        maxNeededTime = neededTime[i];
      }

    return ans;
  }
}
        // int n=colors.length();
        // char [] ch=colors.toCharArray();
        // int i=0;
        // int [] vis=new int[colors.length()];
        // int j=1;
        // int sum=0;
        // while(i<colors.length()-1){
        //      if(ch[i]!=ch[j]&&vis[i]==0&&vis[j]==0){
        //         i++;    
        //         j++; 
        //     }
        //     else if(ch[i]!=ch[j] &&(vis[i]!=0||vis[j]!=0)){
        //         i=j;
        //         j++;

        //     }
        //     else if(ch[i]==ch[j]){
        //         if(neededTime[i]<neededTime[j]){
        //             sum+=neededTime[i];
        //             vis[i]=1;
        //             i++;
        //             j++;
        //         }
        //         if(neededTime[j]<neededTime[i]){

        //             sum+=neededTime[j];
        //             vis[j]=2;
        //             j++;
        //         }
        //     }
            
        // }
        // return sum;
    
