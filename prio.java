import java.util.PriorityQueue;

public class prio {
    public static void main(String[] args) {
        int nums[]={20,10,60,30,50,40};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int k=3;
        
        // pq.add(20);
        // pq.add(10);
        // pq.add(60);
        // pq.add(30);
        // pq.add(50);
        // pq.add(40);
        // System.out.println(pq);
        // System.out.println(pq.size());
        for(int i=0;i<k;i++){
            pq.add(nums[i]);

        }
        System.out.println(pq);
        for(int i=k;i<nums.length;i++){
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        System.out.println(pq.peek());

    }
    
}
