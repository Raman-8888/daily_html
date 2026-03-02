class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        int zeroCount = 0;
        int totalProduct = 1;

        for(int num : arr) {
            if(num == 0) zeroCount++;
            else totalProduct *= num;
        }

        for(int i = 0; i < n; i++) {
            if(zeroCount > 1)
                res[i] = 0;
            else if(zeroCount == 1) {
                if(arr[i] == 0)
                    res[i] = totalProduct;
                else
                    res[i] = 0;
            } else {
                res[i] = totalProduct / arr[i];
            }
        }

        return res;
    }
}