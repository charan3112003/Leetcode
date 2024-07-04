class Solution {
    public String makeSmallestPalindrome(String s) {
         char [] str=new char[s.length()];
        int i=0;
        int j=s.length()-1;
        int count=0;
        String a="";
        int n=s.length();
        int c=n/2;
        while(i<c){
            if(s.charAt(i)==s.charAt(j)){
                str[i]=s.charAt(i);
                str[j]=s.charAt(j);
                i++;
                j--;
            }
            else{
                int temp1=s.charAt(i);
                int temp2=s.charAt(j);
                if(temp1>temp2){
                    str[i]=s.charAt(j);
                    str[j]=s.charAt(j);
                    i++;
                    j--;
                }
                else{
                    str[i]=s.charAt(i);
                    str[j]=s.charAt(i);
                    i++;
                    j--;
                }
            }
        }
        if(i==j){
            str[i]=s.charAt(i);
        }
        for(int k=0;k<str.length;k++){
            a=a+str[k];
        }
        return a;
    }
}