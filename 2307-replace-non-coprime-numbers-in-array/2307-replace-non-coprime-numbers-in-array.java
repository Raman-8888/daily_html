import java.util.*;

class Solution {
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long lcm(int a, int b) {
        return (long)a / gcd(a, b) * b;
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : nums) {
            stack.addLast(num);

            while (stack.size() > 1) {
                int b = stack.removeLast();
                int a = stack.removeLast();
                int g = gcd(a, b);

                if (g > 1) {
                    stack.addLast((int) lcm(a, b));
                } else {
                    stack.addLast(a);
                    stack.addLast(b);
                    break;
                }
            }
        }

        return new ArrayList<>(stack);
    }
}
