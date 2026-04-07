class Solution {
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        string = string.replaceAll("[^a-zA-Z0-9]", "");
        int end = string.length()-1;
        int found = 0;
        for(int i = 0; i<string.length()/2; i++) {
            if(string.charAt(i) != string.charAt(end)) {
                found = 1;
                break;
            }
            else {
                end--;
            }
        }
        if(found == 1) {
            return false;
        }
        return true;
    }
}
