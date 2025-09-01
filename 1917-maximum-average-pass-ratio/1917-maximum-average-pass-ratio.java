import java.util.*;
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        
        for (int[] c : classes) {
            pq.add(new double[]{gain(c[0], c[1]), c[0], c[1]});
        }

        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            int pass = (int) top[1] + 1;
            int total = (int) top[2] + 1;
            pq.add(new double[]{gain(pass, total), pass, total});
        }

        double sum = 0;
        for (double[] c : pq) sum += c[1] / c[2];
        return sum / classes.length;
    }

    private double gain(int pass, int total) {
        return (double)(pass + 1) / (total + 1) - (double) pass / total;
    }
}
