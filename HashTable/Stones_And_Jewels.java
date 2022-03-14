class Stones_And_Jewels {
    public int numJewelsInStones(String jewels, String stones) {
        
        // for hashing of small characters
        int small[] = new int[27];
        
        // for hashing of capital characters
        int capital[] = new int[27];
        
        // initializing the arrays
        for(int i=0;i<27;i++)
        {
            small[i] = 0;
            capital[i] = 0;
        }
        
        // hashing the characters of the jewels
        for(int i=0;i<jewels.length();i++)
        {
            if(jewels.charAt(i)>=65 && jewels.charAt(i)<=90)
            {
                capital[jewels.charAt(i)-'A'] = 1;
            }
            else
            {
                small[jewels.charAt(i)-'a'] = 1;
            }
        }
        
        // for storing the answer
        int ans = 0;
        
        // counting the stones which are jewels
        for(int i=0;i<stones.length();i++)
        {
           if(stones.charAt(i)>=65 && stones.charAt(i)<=90)
            {
                if(capital[stones.charAt(i)-'A'] == 1)
                    ans++;
            }
            else
            {
                if(small[stones.charAt(i)-'a'] == 1)
                    ans++;
            }
        }
        
        return ans;
    }
}