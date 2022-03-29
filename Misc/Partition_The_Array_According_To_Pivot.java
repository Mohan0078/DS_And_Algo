class Partition_The_Array_According_To_Pivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        
        int counter = 0;
        
        // for smaller elements
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]<pivot)
           {
               ans[counter] = nums[i];
               counter++;
           }
        }
        
        // for equal elements
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==pivot)
           {
               ans[counter] = nums[i];
               counter++;
           }
        }
        
        // for greater elements
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]>pivot)
           {
               ans[counter] = nums[i];
               counter++;
           }
        }
        
        return ans;
        
    }
}