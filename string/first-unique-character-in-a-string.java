class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray())
        {
            int i=ch-'a';
            freq[i]++;
        }
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i) -'a';
            if(freq[ch]==1)
            {
                return i;
            }
        }
        return -1;
    }
}