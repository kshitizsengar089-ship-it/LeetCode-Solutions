class Solution {
    public int singleNonDuplicate(int[] nums) {
     int low=0;
     int high=nums.length-1;
     int t=0;
     if(nums.length<2)
     {
        return nums[low];
     }
     while(low<=high)
     {
        if(nums[low]==nums[low+1] && nums[high]==nums[high-1])
        {
            low=low+2;
            high=high-2;
        }
        else if(nums[low]!=nums[low+1])
        {   t=nums[low];break;}
        else
        {t=nums[high];break;}
     }
     return t;
    }
}