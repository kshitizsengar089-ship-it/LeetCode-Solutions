class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if((list.size()==0||list.get(0)!=nums[i])&&(list.size()<2||list.get(1)!=nums[i]))
            {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                    
                }
            }
            if(count>(nums.length/3))
                    {
                        list.add(nums[i]);
                    }
            }
                if(list.size()==2)
                {
                    break;
                }
            
            count=0;
            
        }
        return list;
    }
}