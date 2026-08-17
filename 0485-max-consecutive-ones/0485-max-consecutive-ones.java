class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     StringBuilder s= new StringBuilder();
     int max=0;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]==1)
        {
            s.append("1");
            if(i==nums.length-1)
            {
                if(max<s.length())
                {
                    max=s.length();
                }
                s.setLength(0);
            }
        }
        else
        {   
            if(max<s.length())
                {
                    max=s.length();
                }
                s.setLength(0);
        }
        
     } 
     return max;  
    }
}