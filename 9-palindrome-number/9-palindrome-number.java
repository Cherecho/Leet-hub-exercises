
class Solution {
    public boolean isPalindrome(int x) {
        int[] digits = Integer.toString(x).chars().map(c -> c-'0').toArray();
        int y = digits.length-1;
        for(int i = 0; i < digits.length; i++){
            if(digits[i] == digits[y-i]){
            } else {
                return false;
            }
        }
        return true;
    }
}