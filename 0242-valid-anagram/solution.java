class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> Smap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> Tmap = new HashMap<Character, Integer>();
        if(s.length() != t.length()) {
            return false;
        }
        for(int i = 0; i<s.length(); i++) {
            if(Smap.containsKey(s.charAt(i))) {
                Smap.put(s.charAt(i), Smap.get(s.charAt(i)) + 1);
            }
            else {
                Smap.put(s.charAt(i), 1);
            }
            if(Tmap.containsKey(t.charAt(i))) {
                Tmap.put(t.charAt(i), Tmap.get(t.charAt(i)) + 1);
            }
            else {
                Tmap.put(t.charAt(i), 1);
            }
        }
        if(Smap.equals(Tmap)) {
            return true;
        }
        return false;
    }
}
