class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        int start = 0;
        int maxLen = 1;

        for(int i = 0; i < n; i++) {
            for(int j = i + maxLen; j < n; j++) {

                if(isPalindrome(s, i, j)) {
                    int len = j - i + 1;
                    if(len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    boolean isPalindrome(String s, int l, int r) {
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
