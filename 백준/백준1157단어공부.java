import java.util.*;
import java.io.*;
public class 백준1157단어공부 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		word = word.toUpperCase();
		
		int[] cnt = new int[26];
        int max = 0;
        char ans = '?';
 
        for (int i = 0; i < word.length(); i++) {
            cnt[word.charAt(i) - 65]++;
            if (max < cnt[word.charAt(i) - 65]) {
                max = cnt[word.charAt(i) - 65];
                ans = word.charAt(i);
            } else if (max == cnt[word.charAt(i) - 65]) {
                ans = '?';
            }
        }
        System.out.println(ans);
 
	}

}
