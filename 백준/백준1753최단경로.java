import java.io.*;
import java.util.*;
class Node{
	int dest;
	int value;
	Node(int dest, int value)
	{
		this.dest = dest;
		this.value = value;
	}
}
public class 백준1753최단경로 {
	static int V,E,Start;
	static ArrayList<Node>[] graph;
	static boolean[] vi;
	static int[] distance;
	public static void shortest() {
		PriorityQueue<Node> pq = new PriorityQueue<Node>(new Comparator<Node>(){
			public int compare(Node node1, Node node2)
			{
				if(node1.value>node2.value)
					return 1;
				else
					return -1;
			}
		}) ;
		
		distance[Start] =0;
		pq.add(new Node(Start,0));
		while(!pq.isEmpty())
		{
			int current = pq.poll().dest;
			if(vi[current] == true)
				continue;
			vi[current] = true;
			
			for(Node node : graph[current])
			{
				if(distance[node.dest] > node.value + distance[current])
					distance[node.dest] = node.value + distance[current];
				pq.add(new Node(node.dest, distance[node.dest]));
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		graph = new ArrayList[V+1];
		for(int i=1; i<=V; i++)
		{
			graph[i] = new ArrayList<Node>();
		}
		vi = new boolean[V+1];
		distance = new int[V+1];
		Start = Integer.parseInt(br.readLine());
		Arrays.fill(vi, false);
		Arrays.fill(distance, Integer.MAX_VALUE);
		for(int i=0; i<E;i++)
		{
			str = br.readLine();
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			graph[a].add(new Node(b,c));
			
		}
		shortest();
		
		distance[Start] =0;
		
		for(int i=1; i<=V; i++)
		{
			if(distance[i] == Integer.MAX_VALUE)
				System.out.println("INF");
			else
				System.out.println(distance[i]);
		}
		
	}

}
