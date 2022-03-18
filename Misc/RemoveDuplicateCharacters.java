class RemoveDuplicateCharacters {
    public String removeDuplicateLetters(String s) {
        
        // for storing the answer
        String ans = "";
        // for storing the occurences of characters 
        int visited[] = new int[27];
        // for counting the occurences of the String
        int cnt[] = new int[27];
        
        // initializing the visit and count array
        for(int i=0;i<27;i++)
        {visited[i] = 0;cnt[i] = 0;}
          
        // counting the occurences
        for(int i=0;i<s.length();i++)
        {
            cnt[s.charAt(i)-'a']++;
        }
        
        String result = "";
        
        // iterating through the given string
       for(int i=0;i<s.length();i++)
     {
                // removing the current char count
                cnt[s.charAt(i)-'a']--;
            // if current character is not visited
           if(visited[s.charAt(i)-'a']==0)
{
   // checking if there is smmaller sequence
while(result.length()>0 && 
      result.charAt(result.length()-1)-'a'>s.charAt(i)-'a' && cnt[result.charAt(result.length()-1)-'a']>0)
{
    // unmarking if the last character of the result String greater than 
    // current character of the String
    visited[result.charAt(result.length()-1)-'a'] = 0;
    // removing the last Character of the result String
    result = result.substring(0,result.length()-1);
}
    
  // marking the current character as visited
  visited[s.charAt(i)-'a'] = 1;
  
  // adding the current character to the result String
  result += s.charAt(i)+"";
                    

 }
}
   
        // returning the result
        return result;
    }
}