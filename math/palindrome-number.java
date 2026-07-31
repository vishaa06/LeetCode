class Solution {
    public boolean isPalindrome(int x) {
        long rev=0;
        int temp=x;
        if(x<0 || (x%10==0 && x!=0))
            return false;
        else
        {
            while(x>0){
                int d=x%10;
                rev=rev*10+d;
                x=x/10;
            }
            if(rev==temp)
                return true;
            else
                return false;
        }
    }
}