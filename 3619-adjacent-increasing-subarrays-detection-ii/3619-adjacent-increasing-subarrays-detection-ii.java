class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int ans = 0;
        int pre = 0;
        int cur = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            cur++;

            // Check if the increasing sequence ends here
            if (i == n - 1 || nums.get(i) >= nums.get(i + 1)) {
                ans = Math.max(ans, Math.max(cur / 2, Math.min(pre, cur)));
                pre = cur;
                cur = 0;
            }
        }

        return ans;
    }
}
