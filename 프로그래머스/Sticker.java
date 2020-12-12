import java.math.*;
public class Sticker {

	public static void main(String[] args) {
	 
	 int[] sticker = {14, 6, 5, 11, 3, 9, 2, 10};
	 if (sticker.length <= 3) 
	 {
         int max = 0;
         for (int i = 0; i < sticker.length; i++) 
         {
             max = Math.max(max, sticker[i]);
         }
         System.out.println(max);
         // return max;
     }
	 
	 int[] dp1 = new int[sticker.length-1];
	 int[] dp2 = new int[sticker.length-1];
	 
	 dp1[0] = sticker[0];
	 dp1[1] = Math.max(sticker[0], sticker[1]);
	 
	 for(int i=2; i<dp1.length; i++)
	 {
		 dp1[i] = Math.max(dp1[i-1], dp1[i-2]+sticker[i]);
	 }
	 
	 dp2[0] = sticker[1];
	 dp2[1] = Math.max(sticker[1], sticker[2]);
	 
	 for(int i=2; i<dp1.length; i++)
	 {
		 dp2[i] = Math.max(dp2[i-1], dp2[i-2]+sticker[i+1]);
	 }
	 
	 int answer = Math.max(dp1[dp1.length-1], dp2[dp2.length-1]);
	 System.out.println(answer);
	 // return answer;
		 
	 

	}

}
