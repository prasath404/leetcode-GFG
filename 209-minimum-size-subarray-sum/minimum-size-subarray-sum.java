class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int total = 0;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            total = total + nums[i];
            while (total>=target){
                res = Math.min(res,i-l+1);
                total = total - nums[l];
                l = l + 1;
            }
        }
        if (res ==  Integer.MAX_VALUE){
            return 0;
        }
        else{
            return res;
        }
    }
}