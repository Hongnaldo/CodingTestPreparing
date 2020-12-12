import java.util.*;
import java.io.*;
class Node2{
   int dest;
   int value;
   Node2(int dest, int value)
   {
      this.dest = dest;
      this.value = value;
   }
}
public class 백준9370미확인도착지 {
   static int T,n,m,t,s,g,h;
   static int[][] arr;
   static int[] ans;
   static int[] distance;
   static boolean[] vi;
   public static void shortest() {
      PriorityQueue<Node2> pq = new PriorityQueue<Node2>(new Comparator<Node2>() {
         public int compare(Node2 node1, Node2 node2)
         {
            if(node1.value> node2.value)
               return 1;
            else
               return -1;
               
         }
      });
      pq.add(new Node2(s,0));
      distance[s] =0;
      
      while(!pq.isEmpty())
      {
         int current = pq.poll().dest;
         if(vi[current] == true)
            continue;
         vi[current] = true;
         for(int i=1; i<=n;i++)
         {
            if(vi[i]==false && distance[i]> distance[current] + arr[current][i])
            {
               distance[i] = distance[current]+arr[current][i];
               pq.add(new Node2(i, distance[i]));
            }
               
           
         }
         
           
      }
   }
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      T = Integer.parseInt(br.readLine());
      for(int o=0;o<T;o++) {
      String str = br.readLine();
      StringTokenizer st = new StringTokenizer(str);
      n = Integer.parseInt(st.nextToken());
      m = Integer.parseInt(st.nextToken());
      t = Integer.parseInt(st.nextToken());
      str = br.readLine();
      st = new StringTokenizer(str);
      s = Integer.parseInt(st.nextToken());
      g = Integer.parseInt(st.nextToken());
      h = Integer.parseInt(st.nextToken());
      arr = new int[n+1][n+1];
      distance = new int[n+1];
      vi = new boolean[n+1];
      for(int[] a : arr)
         Arrays.fill(a, 10000000);
      Arrays.fill(distance, 10000000);
     
      
      
         
      for(int i=1; i<=m;i++)
      {
         str = br.readLine();
         st = new StringTokenizer(str);
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         int c = Integer.parseInt(st.nextToken());
         arr[a][b] = arr[b][a] = c*2;
      }
      arr[h][g] = arr[g][h] = arr[h][g]-1;
   
      
      ans = new int[t];
      for(int i=0;i<t;i++)
         ans[i]= Integer.parseInt(br.readLine());
      Arrays.sort(ans);
      shortest();
      
      for(int i=0;i<t; i++)
      {
         if(distance[ans[i]] %2 ==1)
            System.out.print(ans[i]+" ");
      }
      System.out.println();
      }
      
   }
   

}