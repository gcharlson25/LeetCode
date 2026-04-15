class Solution {
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        string = string.replaceAll("[^a-z0-9]", "");
        int end = string.length()-1;
        for(int i = 0; i<string.length()/2; i++) {
            if(string.charAt(i) != string.charAt(end)) {
                return false;
            }
            end--;
        }
        return true;


    }
}
