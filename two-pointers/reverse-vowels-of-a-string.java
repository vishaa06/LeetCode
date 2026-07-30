class Solution {
    public String reverseVowels(String s) {
        StringBuilder op = new StringBuilder();
        StringBuilder sb=new StringBuilder();
        String vowel="aeiouAEIOU";
        
        for(char ch:s.toCharArray())
        {
            if(vowel.indexOf(ch)!=-1)
            {
                sb.append(ch);
            }
        }
        int j=sb.length()-1;
        for(char ch:s.toCharArray())
        {
            if(vowel.indexOf(ch)!=-1)
            {
                op.append(sb.charAt(j--));
            }
            else
            {
                op.append(ch);
            }
        }
        return op.toString();
        
    }
}