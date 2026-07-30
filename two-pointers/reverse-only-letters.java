class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=0;
        String res="";
        StringBuilder rev=new StringBuilder();
        rev.append(s);
        rev.reverse();
        
        for(i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                while(!(Character.isLetter(rev.charAt(j))) && j<rev.length())
                {
                    j++;
                }
                res=res+rev.charAt(j);
                j++;
            }
            else
            {
                res=res+s.charAt(i);
            }
        }
        return res;
    }
}