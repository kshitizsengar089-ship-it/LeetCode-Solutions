class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int a=voc(c);
            if(i+1<s.length() && voc(s.charAt(i+1))>a)
            {sum-=a;}
            else{
                sum+=a;
            }
        }
        return sum;
    }
    public int voc(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default : return 0;
        }
    }
}