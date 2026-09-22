class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        leftProduct[0] = nums[0];
        rightProduct[n-1] = nums[n-1];

        for(int i = 1 ; i<n ; i++){
            leftProduct[i] = leftProduct[i-1]*nums[i];
        }

        for(int i = n-2;i>=0 ; i--){
            rightProduct[i] = rightProduct[i+1]*nums[i];
        }

        int[] res = new int[n];

        int idx=0;
        for(int i = 0 ; i<n; i++){
            if(i == 0) res[idx] = rightProduct[i+1];
            else if(i == n-1) res[idx] = leftProduct[n-2];
            else{
                res[idx] = leftProduct[i-1]*rightProduct[i+1];
            }
            idx++;
        }

        return res;
    }
}  
