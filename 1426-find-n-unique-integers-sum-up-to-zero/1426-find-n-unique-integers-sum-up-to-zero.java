class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int i = 0;
        if (n % 2 != 0) {
            arr[i++] = 0;
        }

        for (int num = 1; num <= n / 2; num++) {
            arr[i++] = num;
            arr[i++] = -num;
        }

        return arr;
    }
}
