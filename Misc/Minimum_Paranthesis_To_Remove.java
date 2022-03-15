class Minimum_Paranthesis_To_Remove {
    public String minRemoveToMakeValid(String s) {
        Stack<String> stk = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
if(stk.isEmpty() && (s.charAt(i) == '(' || s.charAt(i) == ')' ))
{
    stk.push(s.charAt(i)+""+i);
}
else if(s.charAt(i)=='(' || s.charAt(i)==')')
{
   String temp = stk.peek();
    if(temp.charAt(0)=='(' && s.charAt(i)==')')
    {
        stk.pop();
    }
    else
    {
        stk.push(s.charAt(i)+""+i);
    }
}
        }
        
        
        int visit[] = new int[100001];
        // getting the contents of the stack to visit array
        while(!stk.isEmpty())
        {
            String temp = stk.pop();
            // System.out.println(temp);
            String t = temp.substring(1);
            int index = Integer.parseInt(t);
            System.out.println(index);
            visit[index] = 1;
        }
        
        // getting the valid String
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='(' || s.charAt(i)==')') && visit[i] ==1)
                continue;
            ans += s.charAt(i);
        }
        
        return ans;
        
    }
}