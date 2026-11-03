class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int opened=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
           if(ch=='(')
           {
                if(opened>0)
                {
                    ans.append(ch);
                }
                opened++;
            }
            else{
                opened--;
                    if(opened>0)
                    {
                        ans.append(ch);
                    }
            }

        }
        return ans.toString();
    }
}