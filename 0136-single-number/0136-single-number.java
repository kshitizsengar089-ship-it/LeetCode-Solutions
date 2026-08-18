class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int temp=0;
        Arrays.sort(nums);
     for(int i=nums.length-1;i>=0;i--)
     {
        if(i==nums.length)
        {
            temp= nums[i];
            break;
        }
        if(i>0 && nums[i]==nums[i-1])
        {
            count+=2;
        }
        else{
            if(count==0)
            {
             temp=nums[i];
             break;
            }
            count=0;
        }

     }
     return temp; 
    }
}