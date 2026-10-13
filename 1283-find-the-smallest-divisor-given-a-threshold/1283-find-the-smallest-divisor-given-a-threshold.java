class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
     
    int low=1;
    int high=0;
    int ans=0;
    for(int num:nums)
    {
        if(num>high)
        {high=num;}
    }    
    while(low<=high)
    {
        int mid= low+(high-low)/2;
        if(getsum(nums,mid)<=threshold)
        {
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }

    }
    return ans;
}
    public int  getsum(int nums[],int divisor)
    {
        int sum=0;
        for(int num:nums)
        {
          sum=sum+(num+divisor-1)/divisor;      
        }
        return sum;
    }

     
}