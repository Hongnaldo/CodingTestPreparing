import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class 백준1780종이의개수 {
    public static int size;
    
    public static int[] cnt;
    public static int[][] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        
        cnt = new int[3];
        arr = new int[size][size];
        
        StringTokenizer st = null;
        for(int i=0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken()) + 1;
            }
        }
        
        divideAndConquer(0,0,size);
        
        System.out.println(cnt[0] + "\n" + cnt[1] + "\n" + cnt[2]);
        
    }
    
    public static boolean isAble(int r, int c, int len) {
        int t = arr[r][c];
        
        for(int i = r; i < r+len; i++) {
            for(int j = c; j < c+len; j++) {
                if(t != arr[i][j]) return false;
            }
        }
        return true;
    }
    
    public static void divideAndConquer(int r, int c, int len) {
        // 같으면 해당 수의 count를 1 증가 시켜준다.
        if(isAble(r, c, len)) {
            cnt[arr[r][c]] += 1;
        }else {
            // 다르면 len을 3으로 나눠서 3으로 나눈거에 대한 첫 인덱스에 해당 되는 좌표로 재호출한다.
            // 0 ~ 8 의 len이 9였는데 만족이 안됐다면 len이 3이 되고 각 시작점 {0,0}, {0,3}, {0,6} 으로 다시 재호출한다.
            //                                                        {3,0}, {3,3}, {3,6}
            //                                                        {6,0}, {6,3}, {6,6}
            // 현재 좌표 + 새로운길이 * 0 or 1 or 2 -> 9로 나눈 새로운 좌표가 나온다.
            
            int newLen = len/3;
            
            for(int i=0; i < 3; i++) {
                for(int j=0; j < 3; j++) {
                    divideAndConquer(r+newLen*i, c+newLen*j, newLen);
                }
            }
        }
    }
}
