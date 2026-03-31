class Solution {
    public boolean isPalindrome(int x) {
        String palindrome = Integer.toString(x);
        int count = 0;
        for(int i = 0; i < palindrome.length()/2; i++) {
            if(!(palindrome.charAt(i) == palindrome.charAt(palindrome.length()-1-i))) {
                break;
            }
            count++;
        }
        if(count == palindrome.length() / 2) {
            return true;
        }
        return false;
    }
}
