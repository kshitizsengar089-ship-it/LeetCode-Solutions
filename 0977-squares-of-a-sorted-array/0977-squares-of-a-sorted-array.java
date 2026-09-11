class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int pos=nums.length-1;
        int arr[]=new int[nums.length];
        while(start<=end)
        {
            int sqstart=nums[start]*nums[start];
            int sqend=nums[end]*nums[end];
            if(sqstart<sqend)
            {
                arr[pos]=sqend;
                end--;
            }
            else{
                arr[pos]=sqstart;
                start++;
                
            }
            pos--;
        }
        return arr;
    }
}