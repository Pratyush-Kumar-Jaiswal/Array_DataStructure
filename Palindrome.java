/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
*/
class Palindrome {
    public boolean isPalindrome(int x) {
        int res=0;
        int t=x;
        while(x!=0){
            int d=x%10;
            res=res*10+d;
            x/=10;
        }
        if(t<0)
            return false;
        if(t==res)
            return true;
        else
            return false;
    }
}
