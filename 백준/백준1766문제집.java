<<<<<<< HEAD
import java.util.*;
import java.io.*;
public class 백준1766문제집 {
	static int N,M;
	static int[] rank;
	static int[] arr;
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
    static void solve(ArrayList<List<Integer>> list) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
 
        for(int i=1; i<=N; i++) {
            if(arr[i] == 0)
                pq.add(i);
        }
 
        while(!pq.isEmpty()) {
            int node = pq.poll();
 
            for(Integer i : list.get(node)) {
                arr[i]--;
 
                if(arr[i] == 0)
                    pq.add(i);
            }
 
            System.out.print(node + " ");
        }
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        arr = new int[N+1];
 
        for(int i=0; i<N+1; i++)
            ans.add(new ArrayList<Integer>());
 
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
 
           
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
 
            ans.get(a).add(b);
            arr[b]++;
        }
 
        solve(ans);        
    }
 
   

=======
import java.util.*;
import java.io.*;
public class 백준1766문제집 {
	static int N,M;
	static int[] rank;
	static int[] arr;
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
    static void solve(ArrayList<List<Integer>> list) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
 
        for(int i=1; i<=N; i++) {
            if(arr[i] == 0)
                pq.add(i);
        }
 
        while(!pq.isEmpty()) {
            int node = pq.poll();
 
            for(Integer i : list.get(node)) {
                arr[i]--;
 
                if(arr[i] == 0)
                    pq.add(i);
            }
 
            System.out.print(node + " ");
        }
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        arr = new int[N+1];
 
        for(int i=0; i<N+1; i++)
            ans.add(new ArrayList<Integer>());
 
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
 
           
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
 
            ans.get(a).add(b);
            arr[b]++;
        }
 
        solve(ans);        
    }
 
   

>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
}