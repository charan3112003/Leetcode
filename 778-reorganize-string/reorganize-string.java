class Solution {
    public String reorganizeString(String s) {
        int[] charfreq=new int[26];
        int maxchar=0;
        int max=0;
        char[] chr=s.toCharArray();
        for(char ch:chr){
            int index=ch-'a';
            charfreq[index]++;
            if(charfreq[index]>maxchar){
                maxchar=charfreq[index];
                max=index;
            }
        }
        if(maxchar>(s.length()+1)/2)
        return "";

        char res[]=new char[s.length()];
        int index=0;
            while(charfreq[max]>0){
                res[index]=(char) (max+'a');
                index=index+2;
                charfreq[max]--;
            }
        
        for(int i=0;i<26;i++){
            while(charfreq[i]>0){
                if(index>=s.length()){
                    index=1;
                }
                res[index]=(char)( i+'a');
                index=index+2;
                charfreq[i]--;
            }
        }
     return new String(res);

    }
}