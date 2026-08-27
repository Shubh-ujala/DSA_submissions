class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()){
            if(!hm.containsKey(ch)) return false;

            int val = hm.get(ch);
            hm.put(ch,val-1);

            if(hm.get(ch) == 0) hm.remove(ch);
        }

        return hm.size() == 0;
    }
}
