class Solution {
    public int maxProfit(int[] prices) {
       int currentprice=Integer.MAX_VALUE;
       int maxprofit=0 ;
       for(int i=0;i<prices.length;i++)
       {
        if(currentprice < prices[i])
        {
            int profit=prices[i]-currentprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        else{
            currentprice=prices[i];
        }
       }
       return maxprofit;
    

    }
}