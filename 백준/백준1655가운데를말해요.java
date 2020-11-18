import java.util.*;
import java.io.*;
public class 백준1655가운데를말해요 {
	static int N;
	static PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
	static PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Comparator.reverseOrder());
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N; i++)
		{
			int a = Integer.parseInt(br.readLine());
			if(i%2 ==0)
			{
				maxheap.add(a);
			}
			else
				minheap.add(a);
			if(!maxheap.isEmpty() && !minheap.isEmpty())
			{
				if(maxheap.peek() >= minheap.peek())
				{
				int temp = maxheap.poll();
				maxheap.add(minheap.poll());
				minheap.add(temp);}
			}
			System.out.println(maxheap.peek());
		}
	}

}
