class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for(int i=0; i<len ; i++){
            set.add(nums[i]);
        }
        if(len == set.size()){
            return false;
        }
        return true;
    }
}