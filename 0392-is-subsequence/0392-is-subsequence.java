class Solution {
    public boolean isSubsequence(String s, String t) {

        int pos=0;
        if(s.length()<1)
        {
            return true;
        }
        for(int i=0;i<t.length();i++)
        {
            if(s.charAt(pos)==t.charAt(i))
            {
                pos++;
                if(pos==s.length())
                {
                    return true;
                }
            }
           
        }
        return false;
    }
}