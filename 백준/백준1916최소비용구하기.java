import java.util.*;
import java.io.*;
class Node1{
	int dest;
	int value;
	Node1(int dest, int value)
	{
		this.dest = dest;
		this.value = value;
	}
	
}
public class 백준1916최소비용구하기 {
	static int N,M;
	static ArrayList<Node1>[] graph;
	static int[] distance;
	static boolean[] vi;
	static int start,end;
	public static void shortest() {
		PriorityQueue<Node1> pq = new PriorityQueue<Node1>(new Comparator<Node1>() {
			public int compare(Node1 node1, Node1 node2) {
				if(node1.value>node2.value)
					return 1;
				else
					return -1;
			}
			
		});
		distance[start] = 0;
		pq.add(new Node1(start,0));
		while(!pq.isEmpty())
		{
			int current = pq.poll().dest;
			if(vi[current] == true)
				continue;
			vi[current] = true;
			
			for(Node1 node : graph[current])
			{
				if(distance[node.dest] > node.value + distance[current])
					distance[node.dest] = node.value +distance[current];
				pq.add(new Node1(node.dest, distance[node.dest]));
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		graph = new ArrayList[N+1];
		distance = new int[N+1];
		vi = new boolean[N+1];
		
		for(int i=1; i< N+1; i++)
		{
			graph[i] = new ArrayList<Node1>();
		}
		Arrays.fill(distance, Integer.MAX_VALUE);
		Arrays.fill(vi, false);
		
		for(int i=0; i<M; i++)
		{
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			graph[a].add(new Node1(b,c));
		}
		String str1 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(str1);
		start = Integer.parseInt(st1.nextToken());
		end = Integer.parseInt(st1.nextToken());
		
		shortest();
		
		System.out.println(distance[end]);
	}

}
