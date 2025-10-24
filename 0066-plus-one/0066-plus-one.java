import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] arr) {
        // Convert array to string "123"
        StringBuilder sb = new StringBuilder();
        for (int digit : arr) {
            sb.append(digit);
        }

        // Convert string to BigInteger and add 1
        BigInteger num = new BigInteger(sb.toString());
        num = num.add(BigInteger.ONE);

        // Convert result back to int array
        String resultStr = num.toString();
        int[] res = new int[resultStr.length()];
        for (int i = 0; i < resultStr.length(); i++) {
            res[i] = resultStr.charAt(i) - '0';
        }

        return res;
    }
}
