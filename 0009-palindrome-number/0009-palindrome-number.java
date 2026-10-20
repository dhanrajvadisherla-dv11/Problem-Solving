class Solution {
    public boolean isPalindrome(int x) {
        long rev = 0;
        long num1 = x;
        while (x >= 1) {
            rev += x % 10;
            rev = rev * 10;
            x = x / 10;
        }

        rev = rev / 10;   // Remove the extra 0

        System.out.println(rev);


        if(rev == num1)
        {
           return true;
        }
        else
        {
           return false;
        }
    }
}