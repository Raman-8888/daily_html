class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }

        String cleaned = str.toString();
        String reversed = str.reverse().toString();

        return cleaned.equals(reversed);
    }
}
