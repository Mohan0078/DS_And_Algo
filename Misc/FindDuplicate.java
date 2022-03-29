class FindDuplicate {
    public int findDuplicate(int[] nums) {
 
    // method 1
    // simple way
//         Arrays.sort(nums);
        
//         for(int i=1;i<nums.length;i++)
//             if(nums[i]==nums[i-1])
//             return nums[i];
        
    // method 2
    // smarter way
    for(int i=0;i<nums.length;i++)
    {
        int index = Math.abs(nums[i])-1;
        
        nums[index] = nums[index]*(-1);
        
        if(nums[index]>0)
        {
            return Math.abs(nums[i]);
        }
    }
        return -1;
    }
}