class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer>visited=new HashSet<>(); 
     
       while(n!=1 && !visited.contains(n))
       {
         visited.add(n);
         n=sum(n);
       } 
        if(n==1)
      {
        return true;
      }
      return false;
    }
    public int sum(int n)
    {
        int sum=0;
        while( n>0 )
        {
            int a=n%10;
           
            sum=sum+a*a;
             n=n/10;
        }
        return sum;
    }
}