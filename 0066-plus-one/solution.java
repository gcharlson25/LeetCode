class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length - 1]++;
        for(int i = digits.length - 1; i >= 0; i--) {
            if(carry == 1) {
                digits[i]++;
                carry = 0;
            }
            if(digits[i] == 10) {
                digits[i] = 0;
                carry = 1;
            }
        }
        if(carry == 1) {
            int[] bigger = new int[digits.length + 1];
            bigger[0] = 1;
            return bigger;
        }
        return digits;
    }
}
