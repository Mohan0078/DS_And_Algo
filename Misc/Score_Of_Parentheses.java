class Score_Of_Parentheses {
    public int scoreOfParentheses(String s) {
        
        Stack<Integer> stk = new Stack<Integer>();
        int score = 0;
        
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='(')
            {
              stk.push(score);
              score = 0;
            }
            else
            {
              score = stk.peek()+Math.max(2*score,1);
              stk.pop();
            }
        }
        
        return score;
    }
    
}