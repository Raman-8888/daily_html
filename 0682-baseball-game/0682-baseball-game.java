import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();

        for (String c : ops) {
            if (c.equals("+")) {
                int b = st.pop();
                int a = st.peek();
                st.push(b);
                st.push(a + b);
            } else if (c.equals("D")) {
                st.push(2 * st.peek());
            } else if (c.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(c));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}
