class Solution {
    public int lengthOfLastWord(String s) {
        int word = 0;
        int count = 0;
        for(int i = s.length()-1; i>= 0; i--) {
            if(s.charAt(i) != ' ') {
                word = 1;
                count++;
            }
            if(s.charAt(i) == ' ' && word == 1) {
                return count;
            }
        }
        return count;
    }   
}
