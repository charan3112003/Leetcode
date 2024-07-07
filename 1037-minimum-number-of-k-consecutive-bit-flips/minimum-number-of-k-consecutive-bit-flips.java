import java.util.Arrays;

public class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] isFlipped = new int[n];
        int currentFlips = 0;
        int flipCount = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                currentFlips -= isFlipped[i - k];
            }

            if (currentFlips % 2 == nums[i]) {
                if (i + k > n) {
                    return -1;  // Cannot flip because it goes out of bounds
                }
                isFlipped[i] = 1;
                currentFlips++;
                flipCount++;
            }
        }

        return flipCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 1, 0};
        int k1 = 2;
        System.out.println(sol.minKBitFlips(nums1, k1));  // Output: -1

        int[] nums2 = {0, 1, 0};
        int k2 = 1;
        System.out.println(sol.minKBitFlips(nums2, k2));  // Output: 2
    }
}

// class Solution {
//     public int minKBitFlips(int[] nums, int k) {
//         int n=nums.length;
//         int [] ans=new int[nums.length];
//         int flips=0;
        
//         for(int i=0;i<k;i++){
//             if(flips%2==0&&nums[i]%2==0){
//                 int a=++flips;
//                 ans[i]=a;
//             }
//             else if(flips%2!=0&&nums[i]%2!=0){
//                 int b=++flips;
//                 ans[i]=b;
//             }
//             else{
//                 ans[i]=0;
//             }
//         }
//         System.out.println(ans[0]);
//         System.out.println(flips);
//         int ab=k-1;
//         for(int i=k;i<nums.length;i++){
//                 flips=flips-ans[i-k];
//                 if(flips%2==0&&nums[i]%2==0){
//                     ans[i]=1;
//                     flips++;
                    
//                 }
//                 else if(flips%2!=0&&nums[i]%2!=0){
//                     ans[i]=1;
//                     flips++;
                    
//                 }
//                 else{
//                     ans[i]=0;
                    
//                 }
               
//         }
//         int count=0;
//         for(int i=0;i<=ab;i++){
//             count++;
//         }
//         int zero=0;
//         for(int i=0;i<nums.length;i++){
//                 if(nums[i]==0){
//                     zero++;
//                 }
//         }
//         if(zero==0){
//             return 0;
//         }
//         int an=nums.length-count;
//         if(an<k){
//             return -1;
//         }
//         System.out.println(Arrays.toString(ans));
//         //System.out.println(ans[0]);
        
//         int res=0;
//         for(int i=0;i<nums.length;i++){
//             res+=ans[i];
//         }
//         return res;

//     }
// }