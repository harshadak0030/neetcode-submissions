class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[] a= nums;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if (set.contains(nums[i])) { 
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
            return false;
        
    }
}