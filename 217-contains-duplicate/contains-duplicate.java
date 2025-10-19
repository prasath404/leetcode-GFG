import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
        // static void sort(int[] nums){
        //     for(int i=0;i<nums.length-1;i++){
        //         for(int j=0;i<nums.length-i-1;j++){
        //             if(nums[j]>nums[j+1]){
        //                 swap(nums,j,j+1);
        //             }
        //         }
        //     }
        // }
        // static void swap(int[] nums,int i,int j){
        //     int temp=nums[i];
        //     nums[i]=nums[j];
        //     nums[j]=temp;
        // }
