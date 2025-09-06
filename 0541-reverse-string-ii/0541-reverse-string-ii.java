class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();

      
        if (n < k) {
            return sb.reverse().toString();
        }

       
        else if (n < 2 * k) {
            StringBuilder sub = new StringBuilder(sb.substring(0, k));
            sub.reverse();
            String rest = sb.substring(k, n);
            return sub.toString() + rest;
        }

        
        else {
            for (int start = 0; start < n; start += 2 * k) {
                int i = start;
                int j = Math.min(start + k - 1, n - 1);
                while (i < j) {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                    i++;
                    j--;
                }
            }
            return sb.toString();
        }
    }
}
