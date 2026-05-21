class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ret = new int[k][2];
        PriorityQueue<int[]> distance = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int i = 0; i < points.length; i++) {
            int[] dist = new int[3];
            int eq = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            dist[0] = eq;
            dist[1] = points[i][0];
            dist[2] = points[i][1];
            distance.offer(dist);
        }
        int index = 0;
        while(index < k) {
            int[] removed = distance.poll();
            int[] val = new int[2];
            val[0] = removed[1];
            val[1] = removed[2];
            ret[index] = val;
            index++;
        }
        return ret;
    }
}
