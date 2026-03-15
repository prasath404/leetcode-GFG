class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> myset= new HashSet<>();
        List<Integer> list= new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            myset.add(nums[i]);
        }
        for(int i=1;i<nums.length+1;i++){
            if(!myset.contains(i))
            list.add(i);
        }
        return list;
    }
}