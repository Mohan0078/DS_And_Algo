class Substring_Of_Length_Three {
    public int countGoodSubstrings(String s) {
        // for counting the total substring
        int c = 0;
        // length of array
        int n = s.length();
        
        // traverse through the array
        for(int i=0;i<n-2;i++)
        {
            // taking 3 character at a time for finding the desired string of length three
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i+2))
                c++;
        }
        
        return c;
    }
}