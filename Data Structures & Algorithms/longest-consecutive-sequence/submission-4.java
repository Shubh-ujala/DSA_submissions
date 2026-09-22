class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 1) return 1;
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int j = 1;
        int max = 1;
        int count = 1;
        int n = nums.length;
        while(j < n){
            if(nums[j] == nums[j-1]){
                j++;
                continue;
            }else if(nums[j] == nums[j-1]+1) count++;
            else count= 1;
            j++;
            max = Math.max(max,count);
        }

        return max;
    }
}
