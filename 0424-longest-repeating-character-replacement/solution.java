class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int most = 1;
        int longest = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right<s.length()) {
            if(!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), 1);
            }
            else {
                map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
                if(map.get(s.charAt(right)) > most) {
                    most = map.get(s.charAt(right));
                }
            }
            if((right-left + 1) - most > k) {
                left++;
                map.put(s.charAt(left-1), map.get(s.charAt(left-1)) - 1);
            }
            if(right-left + 1 > longest) {
                longest = right-left + 1;
            }
            right++;
        }
        return longest;

    }
}
