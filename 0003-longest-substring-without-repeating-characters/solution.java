class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int pointer = 0; 
        for(int i = 0; i<s.length(); i++) {
            if(!map.containsKey(s.charAt(i)) || map.get(s.charAt(i)) < pointer) {
                map.put(s.charAt(i), i);

            }
            else {
                pointer = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), i);

            }
            if(i - pointer + 1 > longest) {
                longest = i - pointer + 1;
            }

        }
        return longest;
    }
}
