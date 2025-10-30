import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                // Found the pair
                return new int[] { map.get(complement), i };
            }

            // Store number and its index
            map.put(nums[i], i);
        }

        // If no pair found
        return new int[] {};
    }
}
