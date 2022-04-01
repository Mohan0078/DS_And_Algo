class CheckIfDoubleExist {
    public boolean checkIfExist(int[] arr) {
        
        // taking a map 
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        // traversing through the array
        for(int i=0;i<arr.length;i++)
        {
            // checking if the double 
            // of current element or half of
            // the current element exist
            if(map.containsKey(arr[i]*2))
            {
                return true;
            }
            else if(arr[i]%2==0 && map.containsKey(arr[i]/2))
            {
                return true;
            }
            
            map.put(arr[i],0);
        }
        
        return false;
    }
}