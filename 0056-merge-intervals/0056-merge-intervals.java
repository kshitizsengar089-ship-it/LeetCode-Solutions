class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0;
        int n=intervals.length;
        while(i<n)
        {
          int start=intervals[i][0];
          int end=intervals[i][1];

          int j=i+1;

          while(j<n && intervals[j][0]<=end)
          {
             end = Math.max(end,intervals[j][1]);
             j++;
          }
          result.add(new int[]{start,end});
          i=j;
        }
         return result.toArray(new int[result.size()][]);
    }
}