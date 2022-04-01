class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        
        // taking an array for storing the answer
        int ans[] = new int[nums.length];
        
        // for storing positive number at 
        // i%2==0 locations
        // int j = 0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]>=0)
        //     {
        //     ans[j] = nums[i];
        //     j = j+2;
        //     }   
        // }
        
        // for storing positive number at 
        // i%2==1 locations
        // j = 1;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]<0)
        //     {
        //     ans[j] = nums[i];
        //     j = j+2;
        //     }   
        // }
    
        // another way
        int p = 0;
        int n = 1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                ans[n] = nums[i];
                n += 2;
            }
            else
            {
                ans[p] = nums[i];
                p += 2;
            }
        }
        
        return ans;
    }
}