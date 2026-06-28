class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int n = x;
        int sum = 0;
        
        while(n!=0){
            int r = n%10;
            sum = sum*10 + r;
            n /= 10;
        }
        return sum == x;
    }
}