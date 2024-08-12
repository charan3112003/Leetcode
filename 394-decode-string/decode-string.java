class Solution {
    public String decodeString(String s) {
        Stack<Integer> numst=new Stack<>();
        Stack<String> strst=new Stack<>();
        int currentnumber=0;
        String s1="";
        for(char c:s.toCharArray()){

            if(Character.isDigit(c)){
                currentnumber=currentnumber*10+(c-'0');
            }
            else if(c=='['){
                numst.push(currentnumber);
                strst.push(s1);
                currentnumber=0;
                s1="";
            }
            else if(c==']'){
                StringBuilder tempstring=new StringBuilder(s1);
                s1=strst.pop();
                int count=numst.pop();
                String res="";
                for(int i=0;i<count;i++){
                    res+=tempstring.toString();
                }
                s1+=res;
            }
            else{
                s1+=c;
            }

        }
        return s1;
        
    }
}