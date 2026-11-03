class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer>map=new HashMap<>();

       for(int i=0;i<s.length();i++)
       {char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> list =new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer>entry:list){
            char c=entry.getKey();
            int freq=entry.getValue();

            for(int i=0;i<freq;i++)
            {sb.append(c);}
        }
        return sb.toString();
    }
}