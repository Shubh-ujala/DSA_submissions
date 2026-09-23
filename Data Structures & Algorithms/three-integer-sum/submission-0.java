class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();


        for(int i = 0 ; i < n ; i++){
            if( i > 0 && nums[i] == nums[i-1]) continue;
            int x = nums[i];

            int required = -nums[i];

            int j = i + 1;
            int k = n - 1;


            while( j < k){
                if(nums[j] + nums[k] > required){
                    k--;
                }else if(nums[j] + nums[k] < required){
                    j++;
                }else{
                    res.add(Arrays.asList(x,nums[j],nums[k]));

                    j++;
                    k--;

                    while( j < k && nums[j] == nums[j-1]) j++;
                    while( j < k && nums[k] == nums[k+1]) k--;
                }
                
            }
           
        }

        return res;
        
    }
}
