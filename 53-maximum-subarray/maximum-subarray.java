import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        List<Integer> dp = new ArrayList<>();
        dp.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            int curr = Math.max(nums[i],dp.get(i-1)+nums[i]);
            dp.add(curr);
        }
        return Collections.max(dp);
    }
}