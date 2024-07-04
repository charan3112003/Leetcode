class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Character> map=new HashMap<>();
        // char [] arr=new char[num.length()];
        // for(int i=0;i<num.length();i++){
        //     arr[i]=num.charAt(i);
        // }
        for(int i=0;i<num.length();i++){
           // int ch=num.charAt(i);
            map.put(i,num.charAt(i));
        }
        // for(Map.Entry<Integer,Character> mp:map.entrySet()){
        //     System.out.print(mp.getKey()+" "+mp.getValue()+" ");
        // }
        
        for(Integer j: map.keySet()){
            char a=map.get(j);
            int count=a-'0';
            int k=j;
            for(int i=0;i<num.length();i++){
                int o=num.charAt(i)-'0';
                if(k==o){
                    count--;
                }   
            }
            if(count!=0){
                return false;
            }
            
        }

        // for(Map.Entry<Integer,Character> mp:map.entrySet()){
        //     System.out.print(mp.getKey()+" "+mp.getValue()+" ");
        // }
        return true;
    }
}