class MAX_AREA_CONTAINER {
    public int maxArea(int[] height) {
        // for storing the area
        int max_area = 0;
        // left pointer
        int left = 0;
        // right pointer
        int right = height.length-1;
        
        // getting the area of container which can contain
        // max water
        while(left<right)
        {
            // getting the area of current container
            int area = (right-left)*Math.min(height[left],height[right]);
            // getting the max area
            max_area = Math.max(max_area,area);
            // moving the pointers
            // if left height is less then move left side pointer
            // else move right pointer
            if(height[left]<height[right])
            left++;
            else
            right--;
        }
        
        // returning the water
        return max_area;
    }
}