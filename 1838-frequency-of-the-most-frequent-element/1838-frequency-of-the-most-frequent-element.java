class Solution {
    public int maxFrequency(int[] nums, int k) {

       Arrays.sort(nums);
       int maxfreq=0;
       int left=0;
       long total=0;

       for(int right=0;right<nums.length;right++)
       {
         total= total+ nums[right];
        while((long)nums[right]*(right-left+1)-total>k)
        {
            total=total-nums[left];
            left++;
        }
        maxfreq=Math.max(maxfreq,right-left+1);
       } 
       return maxfreq;
    }
}