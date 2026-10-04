class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int CurrSum=0;
        for(int num:nums)
        {
            CurrSum=CurrSum+num;
            
            if(map.containsKey(CurrSum-k))
            {count+=map.get(CurrSum-k);
            }
                
            if(map.containsKey(CurrSum))
            {
                int freq=map.get(CurrSum);
                map.put(CurrSum,freq+1);
            }
            else{
                map.put(CurrSum,1);
            }

        }
        return count;
    }
}    