//https://neetcode.io/problems/duplicate-integer/history?list=allNC&submissionIndex=0

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        return nums.length==set.size()?false:true;
        
    }
}
