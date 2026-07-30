class Solution {
    public String addBinary(String a, String b) {

        while(a.length() > b.length())
        {
            b='0'+b;
        }
        while(a.length()<b.length())
        {
            a='0'+a;
        }

        
        int l1=a.length()-1;
        int l2=b.length()-1;
        int carry=0;
        StringBuilder res = new StringBuilder();

        

        while(l1>=0 && l2>=0)
        {
            int d1=a.charAt(l1--)-'0';
            int d2=b.charAt(l2--)-'0';
            int sum=d1+d2+carry;
            res.append(sum%2);
            carry=sum/2;
        }
        if(carry==1)
        {
            res.append("1");
        }
        return res.reverse().toString();
    }
}