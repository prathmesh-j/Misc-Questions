/**
 * Created by prathmeshjakkanwar on 4/18/17.
 */
public class LongestCommonSubsequence {
    public static void main(String[] args){
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";

        int result = getLongestCommonSubsequenceLength(str1, str2);
        System.out.print(result);
    }

    public static int getLongestCommonSubsequenceLength(String s1, String s2){
        int l2 = s2.length();
        int l1 = s1.length();
        int max = 0;
        int[][] dp = new int[l1+1][l2+1]; // --> creating array with size 1 more than the string length
                                         // to consider 0 length too

        for(int i=1;i<dp.length;i++){
            for (int j=1;j<dp[i].length;j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                if(dp[i][j] > max) {
                    max = dp[i][j];
                }
            }

        }
        return max;
    }
}
