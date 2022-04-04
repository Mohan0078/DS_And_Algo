class Minimize_The_Max_Sum {
    public int minPairSum(int[] nums) {
        
        // sorting the array
        Arrays.sort(nums);
        
        // for storing the answer
        int ans = 0;
        // traversing the array
        for(int i=0;i<nums.length/2;i++)
        {
            ans = Math.max(ans, nums[i]+nums[nums.length-i-1]);
        }
        
        // returning the answer
        
        // two pointer technique
        int l = 0;
        int r = nums.length-1;
        
        ans = 0;
        
        while(l<r)
        {
           ans = Math.max(ans,nums[l]+nums[r]);
            l++;
            r--;
        }
        
        return ans;
    }
}