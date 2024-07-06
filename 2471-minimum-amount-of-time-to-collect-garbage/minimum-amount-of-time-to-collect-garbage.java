class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
       int lastp=0;
       int lastm=0;
       int lastg=0;
       int pc=0;
       int mc=0;
       int gc=0;
       for(int i=0;i<garbage.length;i++){
                String g=garbage[i];
                for (char ch : g.toCharArray())
             {
                if (ch == 'G') {
                    gc++;
                    lastg = i;
                } else if (ch == 'P') {
                    pc++;
                    lastp= i;
                } else if (ch == 'M') {
                    mc++;
                    lastm= i;
                }
            }       
       }
       System.out.println(lastg+" "+lastm+" "+lastp);
    int sumg=0;
    for(int g=0;g<lastg;g++){
            sumg+=travel[g];
       }
       int sump=0;
       for(int p=0;p<lastp;p++){
        sump+=travel[p];
       }
       int summ=0;
       for(int m=0;m<lastm;m++){
        summ+=travel[m];
       }
       System.out.println(sumg+" "+sump+" "+summ);

    //    int gc=0,pc=0,mc=0;
    //    for(int i=0;i<garbage.length;i++){
    //     String gar=garbage[i];
    //      if(gar.length()>1){
    //         int j=0;
    //         while(j<gar.length()){
    //             if(gar.charAt(j)=='G'){
    //                 gc+=1;
                    
    //             }
    //             if(gar.charAt(j)=='P'){
    //                 pc+=1;
                    
    //             }
    //          if(gar.charAt(j)=='M'){
    //                 mc+=1;
    //             }
    //             j++;
    //         }
                
    //         }
        
    //     else{
    //         if(gar=="G"){
    //             gc+=1;
    //         }
    //         if(gar=="P"){
    //             pc+=1;
    //         }
    //         if(gar=="M"){
    //             mc+=1;
    //         }
    //     }
    //    }
       System.out.println(mc+" "+pc+" "+gc);
       int total=mc+pc+gc+summ+sump+sumg;
       return total;
 }

       
}
