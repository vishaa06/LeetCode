class Solution {
    public int countSubstrings(String s) {
        int freq=0;
        String temp;
        
        for(int i=0;i<s.length();i++)
        {
            
            temp="";
            for(int j=i;j<s.length();j++)
            {
                temp=temp+s.charAt(j);
                StringBuilder rev=new StringBuilder(temp).reverse().toString();
                if(temp.equals(rev))
                    freq++;
            }
        }
        return freq;
    }
}