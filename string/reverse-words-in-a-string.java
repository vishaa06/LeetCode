class Solution {
    public String reverseWords(String s) {
        String[] res=s.split("\\s+");
        int i;
        String out="";
        for(i=res.length-1;i>=0;i--)
        {
            out=out+res[i]+" ";
        }
        return out.trim();
    }
}