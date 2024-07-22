class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      
      HashMap<Integer,String> map =new HashMap<>();
      for(int i=0;i<heights.length;i++){
        map.put(heights[i],names[i]);
      }
      Arrays.sort(heights);
      int j=0;
      String []res=new String[heights.length];
      for(int i=heights.length-1;i>=0;i--){
        res[j++]=map.get(heights[i]);
      }
        return res;

    }
}