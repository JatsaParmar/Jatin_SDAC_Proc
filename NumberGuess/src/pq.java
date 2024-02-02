import java.util.Comparator;
import java.util.PriorityQueue;

public class pq {
public static void main(String args[])
{
	PriorityQueue<Integer> pqq = new PriorityQueue<>(Comparator.reverseOrder());
	pqq.offer(null);
	pqq.offer(12);
	pqq.offer(1);
	pqq.offer(1233);
	System.out.println(pqq);
}

}
