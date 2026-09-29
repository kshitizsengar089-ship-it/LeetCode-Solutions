class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;

        while(i<chars.length)
        {
            int count=0;
            char curchar=chars[i];

            while(i<chars.length && chars[i]==curchar)
            {
                i++;
                count++;
            }
         
         chars[j++]=curchar;
        
          if(count>1)
          {
            for(char c:String.valueOf(count).toCharArray()){
                chars[j++]=c;
            }
          }

        }
        return j;
    }
}