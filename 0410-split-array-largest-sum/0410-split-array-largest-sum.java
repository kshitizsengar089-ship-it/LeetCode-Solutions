class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0;
        int right=0;
        for(int num:nums)
        {
            left=Math.max(left,num);
            right+=num;
        }
        int ans=right;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
             if(canSplit(nums,mid,k))
             {
                ans=mid;
                right=mid-1;
             }
             else{
                left=mid+1;
             }
        }
        return ans;
    }
    public boolean canSplit(int nums[],int mid,int k)
    {
        int currentsum=0;
        int subarrays=1;
        for(int num:nums)
        {
            if(num+currentsum>mid)
            {
                currentsum=num;
                subarrays++;
                if(subarrays>k)
                {
                    return false;
                }
            }
            else{
                currentsum+=num;
            }
        }
        return true;
    }
}