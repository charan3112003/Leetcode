class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0||s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> tmap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }
        int lf=0;
        int rt=0;
        int unique=tmap.size();
        int create=0;
        int [] res={-1,0,0};
        Map<Character,Integer> substring=new HashMap<>();
        while(rt<s.length()){
            char temp=s.charAt(rt);
            int c=substring.getOrDefault(temp,0);
            substring.put(temp,c+1);
            if(tmap.containsKey(temp)&&substring.get(temp).intValue()==tmap.get(temp).intValue()){
                create++;
            }
            while(lf<=rt&&create==unique){
                temp=s.charAt(lf);
                if(res[0]==-1||res[0]>=rt-lf+1){
                    res[0]=rt-lf+1;
                    res[1]=lf;
                    res[2]=rt;
                }    
                substring.put(temp,substring.get(temp)-1); 
                if(tmap.containsKey(temp)&&substring.get(temp).intValue()<   tmap.get(temp).intValue()){
                create--;
            }    
            lf++; 
                 
         }
         rt++;
        }
        if(res[0]==-1){
            return "";
        }
        return s.substring(res[1],res[2]+1);


    }
}