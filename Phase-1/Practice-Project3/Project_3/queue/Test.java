package queue;

import java.util.PriorityQueue;
import java.util.Queue;


public class Test {
	public static void main(String[] args) {
		Queue<Integer> que = new PriorityQueue<>();
		for(int i=1;i<=100;i*=3) {
			que.offer(i);
		}
		System.out.println(que);
		
		que.offer(10);
		
		System.out.println(que);
		
		System.out.println(que.poll());
		
		System.out.println(que);
		
		System.out.println(que.peek());
		
		System.out.println(que);
		
		que.remove();
		
		System.out.println(que);
		
		System.out.println(que.element());
		
	}
}
