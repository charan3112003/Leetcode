class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
         int n=arr.length;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(arr[i]%2!=0&&arr[j]%2!=0&&arr[k]%2!=0){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        for(int i=0;i<n-2;i++){
            int sec=i+1;
            int third=i+2;
            if(sec<n-1&&third<n){
                if(arr[i]%2!=0&&arr[sec]%2!=0&&arr[third]%2!=0){
                    return true;
                }
            }
        }
        return false;
    }
}