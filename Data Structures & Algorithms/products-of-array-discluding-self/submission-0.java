class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pf = getPrefixProduct(nums);
        int[] sf = getSuffixProduct(nums);

        int n = nums.length;
        int res[] = new int[n];
        
        for(int i = 0 ; i< n ; i++){
            if(i == 0){
                res[i] = sf[i+1];
            }else if(i == n-1){
                res[i] = pf[i-1];
            }else{
                res[i] = sf[i+1]*pf[i-1];
            }
        }

        return res;
    }
    public int[] getPrefixProduct(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        res[0] = nums[0];

        for(int i = 1; i<n ; i++){
            res[i] = res[i-1]*nums[i];
        }

        return res;
    }

    public int[] getSuffixProduct(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        res[n-1] = nums[n-1];

        for(int i = n-2;i>=0; i--){
            res[i] = res[i+1]*nums[i];
        }

        return res;
    }

}  
