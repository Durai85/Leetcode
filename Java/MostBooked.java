// Leetcode : 2402
import java.util.PriorityQueue;
import java.util.Arrays;

public class MostBooked {
    public int mostBooked(int n, int[][] meetings){
        Arrays.sort(meetings, (a,b) -> a[0] - b[0]);

        PriorityQueue<Integer> available = new PriorityQueue<>();
        for(int i=0; i < n; i++){
            available.add(i);
        }

        PriorityQueue<long[]> used = new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]) return Long.compare(a[0],b[0]);
            return Long.compare(a[1],b[1]);
        });

        int[] count = new int[n];

        for (int[] meeting : meetings){
            long start = meeting[0];
            long end = meeting[1];

            while(!used.isEmpty() && used.peek()[0] <= start){
                available.add((int) used.poll()[1]);
            }

            if (available.isEmpty()){
                long[] earliest = used.poll();
                end = earliest[0] + (end - start);
                available.add((int) earliest[1]);
            }

            int room = available.poll();
            used.add(new long[]{end, room});
            count[room]++;
        }
        int maxIdx = 0;
        for(int i=0; i < n; i++){
            if(count[i] > count[maxIdx]){
                maxIdx = i;
            }
        }
        return maxIdx;
    }    
}
