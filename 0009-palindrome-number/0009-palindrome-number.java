class Solution {
    public boolean isPalindrome(int x) {

      if(x<0){
        return false;
      }  
       int t=x;
      long rev=0;
      while(t!=0){
        int a=t%10;
        rev=rev*10+a;
        t=t/10;
      }
      if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
        return false;
      }
      if(rev==x){
        return true;
      }
      else{
        return false;
      }   
    }
}