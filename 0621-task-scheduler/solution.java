class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] frequency = new int[26];
        for(char task : tasks) {
            frequency[task - 'A']++;
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>( (a,b) -> b[0] - a[0]);
        for(int fq : frequency) {
            int[] task = new int[2];
            task[0] = fq;
            task[1] = n;
            if(fq > 0) {
                heap.add(task);
            }
        }
        int count = 0;
        Queue<int[]> cooldown = new LinkedList<>();
        while(!heap.isEmpty() || !cooldown.isEmpty()) {
            if(!cooldown.isEmpty() && cooldown.peek()[1] <= count) {
                heap.add(cooldown.poll());
            }
            if(heap.peek() != null) {
                int [] removed = heap.poll();
                removed[0]--;
                if(removed[0] != 0) {
                    removed[1] = count + n + 1;
                    cooldown.add(removed);
                }

            }
            count++;
        }
        return count;

    }
}
