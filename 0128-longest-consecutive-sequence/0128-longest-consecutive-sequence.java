class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int maxcount=0;
    
        for(int num:set)
        {
           
            if(!set.contains(num-1))
            { 
              int count=1;   
             int target=num+1;
              while(set.contains(target))
              {
                count++;
                target++;
              } 

            maxcount=Math.max(count,maxcount);
           
            }
              
        }
        return maxcount;
    }
}