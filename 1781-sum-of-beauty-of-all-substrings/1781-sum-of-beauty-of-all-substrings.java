class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int totalBeauty=0;

        for(int i=0;i<n;i++)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++)
            {
                
                char c=s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);

                int minFreq=Integer.MAX_VALUE;
                int maxFreq=0;
                for(int count:map.values())
                {
                    maxFreq=Math.max(maxFreq,count);
                    minFreq=Math.min(minFreq,count);
                }

                totalBeauty+=(maxFreq-minFreq);
            }
        }
        return totalBeauty;
    }
}