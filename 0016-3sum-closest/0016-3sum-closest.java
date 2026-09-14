class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-1;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int start=i+1;
            int end=nums.length-1;
            int closestsum=nums[i]+nums[start]+nums[end];
            
            while(start<end)
            {
                int currentSum=nums[i]+nums[start]+nums[end];

                if(Math.abs(target-currentSum)<Math.abs(target-closestSum)){
                    closestSum=currentSum;
                }
                if(target>currentSum)
                {
                    start++;
                }
                else if(target==currentSum)
                {
                  return currentSum;  
                }
                else{
                    end--;
                }
            }
            
        }
        return closestSum;

        

    }
}