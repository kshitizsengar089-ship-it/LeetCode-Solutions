class Solution {
    public int[] sortArray(int[] nums) {
     if(nums==null || nums.length<=1)
     {return nums;}
     int temp[]=new int[nums.length];
     mergeSort(nums,temp,0,nums.length-1); 
     return nums;         
    }
    public  void mergeSort(int arr[],int temp[],int low,int high)
    {
        if(low<high)
        {
            int mid=low+(high-low)/2;
            mergeSort(arr,temp,low,mid);
            mergeSort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);
        }
    }
    public void merge(int arr[],int temp[],int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=i;
        while(i<=mid && j<=high)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=high)
        {
            temp[k++]=arr[j++];
        }

        System.arraycopy(temp,low,arr,low,high-low+1);
        
    }
}