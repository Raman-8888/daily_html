class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    void backtrack(List<Integer> path, int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path)); 
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;          // mark number as used
            path.add(nums[i]);       // choose it
            backtrack(path, nums, used); // go deeper
            path.remove(path.size() - 1); // undo choice (backtrack)
            used[i] = false;         // unmark
        }
    }
}
