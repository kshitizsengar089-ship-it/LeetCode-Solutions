class Solution {
    public boolean isPalindrome(String s) {

       s=s.toLowerCase();
       StringBuilder w= new StringBuilder();
       for(int i=0;i<s.length();i++)
       {   char c=s.charAt(i); 
           if(Character.isLetterOrDigit(c))
           {w.append(c);
           }
       }
        String filtered=w.toString();
        String reversed=w.reverse().toString();
        return filtered.equals(reversed);

    }
}