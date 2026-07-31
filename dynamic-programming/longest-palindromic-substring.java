class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            int low = i, high = i;
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > ans.length()) {
                    ans = s.substring(low, high + 1);
                }
                low--;
                high++;
            }
            low = i;
            high = i + 1;
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > ans.length()) {
                    ans = s.substring(low, high + 1);
                }
                low--;
                high++;
            }
        }

        return ans;
    }
}