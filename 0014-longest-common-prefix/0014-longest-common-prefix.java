class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null || strs.length==0)
        {return "";}
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while(i<=first.length()-1 && i<=last.length()-1)
        {
            if(first.charAt(i)==last.charAt(i))
            {i++;}
            else{break;}
        }
        return first.substring(0,i);

    }
}