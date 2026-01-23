class Solution {

    boolean isSorted(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) return false;
        }
        return true;
    }

    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);

        int ops = 0;

        while (!isSorted(list)) {
            int min = Integer.MAX_VALUE;
            int idx = 0;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < min) {
                    min = sum;
                    idx = i;
                }
            }

            int merge = list.get(idx) + list.get(idx + 1);
            list.remove(idx + 1);
            list.set(idx, merge);
            ops++;
        }

        return ops;
    }
}
