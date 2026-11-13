class Solution {
    public double myPow(double x, int n) {
       long N=n;
        boolean isNegative=false;
       if(N<0)
       {
        isNegative=true;
        N=-N;
       } 
       double result=1.0;
       double currentProduct=x;

       while(N>0)
       {
         if(N%2==1)
         {
            result*=currentProduct;
         }
         currentProduct *=currentProduct;
         N/=2;
       }
       return isNegative?1.0/result:result;
    }
}