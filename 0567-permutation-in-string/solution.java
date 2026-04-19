class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] s1array = new int [26];
        int [] windowArray = new int [26];
        if(s1.length() > s2.length()) {return false;}
        for(int i = 0; i<s1.length(); i++) {
            s1array[s1.charAt(i) - 'a']++;
            windowArray[s2.charAt(i) - 'a']++;
        }
        for(int i = 0; i<=s2.length()-s1.length(); i++) {
            int match = 0;
            for(int j = 0; j<windowArray.length; j++) {
                if(windowArray[j] == s1array[j]) {
                    match++;
                }
            }
            if(match == 26) {
                return true;
            }    
            if(i < s2.length()-s1.length()) {
                windowArray[s2.charAt(i) - 'a']--;
                windowArray[s2.charAt(i+s1.length()) - 'a']++;
            }       

        }       
        return false;
    }
}
