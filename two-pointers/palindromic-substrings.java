class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = "";

            for (int j = i; j < s.length(); j++) {
                temp = temp + s.charAt(j);

                String rev = new StringBuilder(temp).reverse().toString();

                if (temp.equals(rev)) {
                    count++;
                }
            }
        }

        return count;
    }
}