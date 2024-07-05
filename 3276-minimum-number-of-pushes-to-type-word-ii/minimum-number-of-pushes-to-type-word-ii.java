class Solution {
    public int minimumPushes(String word) {
        int ct[] = new int[26];
        for(char ch: word.toCharArray()){
            ct[ch-'a']++;
        }
        
		// sort the array in descending order
        ct = Arrays.stream(ct).boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        int res = 0;
        for(int i=0; i<26; i++){
            int val = (i)/8;
            int curr = (val+1)*ct[i];
            res += curr;
        }
        return res;
        // int n=word.length();
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(!map.containsKey(word.charAt(i))){
        //         map.put(word.charAt(i),1);
        //     }
        //     else{
        //         map.put(word.charAt(i),map.get(word.charAt(i))+1);
        //     }
        // }
        // int [] freq=new int[map.size()];
        // char [] key=new char[map.size()];
        // int k=0;
        // for (Map.Entry<Character,Integer> set :
        //      map.entrySet()){
        //         freq[k]=set.getValue();
        //         key[k]=set.getKey();
        //      }
    
        //     for(int i=0;i<freq.length-1;i++){
        //         for(int j=i+1;j<freq.length;j++){
        //             if(freq[i]<freq[j]){
        //                 int temp=freq[i];
        //                 freq[i]=freq[j];
        //                 freq[j]=temp;
        //                 //
        //                 char t=key[i];
        //                 key[i]=key[j];
        //                 key[j]=t;
        //             }
        //         }
        //     }
        //     //array in descending order;
        //     int [] desval=new int[freq.length];
        //     char[] deskey=new char[key.length];
        //     int m=0;
        //     for(int l=freq.length-1;l>=0;l--){
        //         desval[m]=freq[l];
        //         m++;
        //     }
        //     int zx=0;
        //     for(int h=key.length-1;h>=0;h--){
        //         deskey[zx]=key[h];
        //         zx++;
        //     }
        //    int size=deskey.length;
        //    int total=0;
        //    if(size<=8){
        //           for(int p=0;p<size;p++){
        //             int ans=freq[p];
        //             total+=ans*1;
        //           }
        //           return total;
        //    }
        //    if(size>8&&size<16){
        //            int d=size%8;
        //            size=size-d;
        //            for(int o=0;o<size;o++){
        //             int ans=freq[o];
        //             total+=ans*1;
        //            }
        //            for(int r=size+1;r<deskey.length;r++){
        //             int e=freq[r];
        //             total+=e*2;
        //            }
        //            return total;
        //    }
        //    if(size==16){
        //     for(int g=0;g<8;g++){
        //         int w=freq[g];
        //         total+=w*1;
        //     }
        //     for(int er=8;er<16;er++){
        //         int w=freq[er];
        //         total+=w*2;
        //     }
        //    }
        //    if(size>16&&size<24){
        //     int f=size%16;
        //     for(int y=0;y<8;y++){
        //         int ans=freq[y];
        //         total+=ans*1;
        //     }
        //     for(int y=8;y<16;y++){
        //         int ans=freq[y];
        //         total+=ans*2;
        //     }
        //     for(int y=16;y<size;y++){
        //         int ans=freq[y];
        //         total+=ans*3;
        //     }
        //    }
        //    if(size==24){
        //     for(int u=0;u<8;u++){
        //         int ans=freq[u];
        //         total+=ans*1;
        //     }
        //     for(int u=8;u<16;u++){
        //         int ans=freq[u];
        //         total+=ans*2;
        //     }
        //     for(int u=16;u<24;u++){
        //         int ans=freq[u];
        //         total+=ans*3;
        //     }
        //    }
        //    if(size>24&&size<26){
        //     int z=size%24;
        //     for(int t=0;t<8;t++){
        //         int ans=freq[t];
        //         total+=ans*1;
        //     }
        //     for(int t=8;t<16;t++){
        //         int ans=freq[t];
        //         total+=ans*2;
        //     }
        //     for(int t=16;t<24;t++){
        //         int ans=freq[t];
        //         total+=ans*3;
        //     }
        //     for(int t=24;t<size;t++){
        //         int ans=freq[t];
        //         total+=ans*4;
        //     }
        //    }
        //    if(size==26){
        //     for(int w=0;w<8;w++){
        //         int ans=freq[w];
        //         total+=ans*1;
        //     }
        //     for(int w=8;w<16;w++){
        //         int ans=freq[w];
        //         total+=ans*2;
        //     }
        //     for(int w=16;w<24;w++){
        //         int ans=freq[w];
        //         total+=ans*3;
        //     }
        //     for(int w=24;w<26;w++){
        //         int ans=freq[w];
        //         total+=ans*4;
        //     }
        //    }
 
    
}
}