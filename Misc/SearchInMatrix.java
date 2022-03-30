class SearchInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // getting the total rows
        int n = matrix.length;
        // getting the columns count
        int m = matrix[0].length;
        
        // traverse through the matrix
        for(int i=0;i<n;i++)
        {
            // for checking if the element is equal to the target
            if(matrix[i][0]==target)
            return true;
            else if(matrix[i][0]<target)
            {
                // if current element in the first column is less than 
                // the target then we will search in that row
                
                // search in the current row
                // applying binary search
                int low = 0;
                int high = m-1;
                while(low<=high)
                {
                    int mid = low+(high-low)/2;
                    
                    if(matrix[i][mid]==target)
                        return true;
                    else if(matrix[i][mid]<target)
                          low = mid+1;
                    else
                          high = mid-1;
                        
                }
            }
        }
        
        // if the element not found on the array
        return false;
    }
}