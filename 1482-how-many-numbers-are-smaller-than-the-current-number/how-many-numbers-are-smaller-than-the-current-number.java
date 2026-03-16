import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] temp =nums.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<temp.length;i++){
            int num = temp[i];
            if(!map.containsKey(num)){
                map.put(num,i);
            }
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=map.get(nums[i]);
        }
        return result;
    }
}