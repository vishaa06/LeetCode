class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l=0,r=0,maxlen=0,maxfreq=0;
        for(r=0;r<s.length();r++)
        {
            freq[s.charAt(r)-65]++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-65]);
            while((r-l+1)-maxfreq>k)
            {
                freq[s.charAt(l)-65]--;
                l++;
            }
            maxlen=Math.max(maxlen,(r-l+1));
        }
        return maxlen;
    }
}