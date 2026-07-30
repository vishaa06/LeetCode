class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        // Count frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        // Determine odd-max and even-min
        for (int f : freq) {
            if (f == 0) continue;

            if (f % 2 == 1) {              // odd
                maxOdd = Math.max(maxOdd, f);
            } else {                       // even
                minEven = Math.min(minEven, f);
            }
        }

        // If no even frequency found → treat as 0
        if (minEven == Integer.MAX_VALUE) minEven = 0;

        return maxOdd - minEven;
    }
}