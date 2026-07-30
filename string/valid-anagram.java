class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] sa=s.toCharArray();
        Arrays.sort(sa);
        char[] ta=t.toCharArray();
        Arrays.sort(ta);
        for(int i=0;i<sa.length;i++)
        {
            if(sa[i]!=ta[i])
            {
                return false;
            }
        }
        return true;
    }
}