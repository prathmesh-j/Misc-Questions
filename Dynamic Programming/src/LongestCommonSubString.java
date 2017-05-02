/**
 * Created by prathmeshjakkanwar on 4/18/17.
 */
public class LongestCommonSubString {

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "xbcdgk";
        System.out.println(getLongestCommonSubString(s1, s2));
    }

    public static int getLongestCommonSubString(String s1, String s2){
        int[][]  dp = new int[s1.length()+1][s2.length()+1];
        int max = 0;
        for(int i=1;i<dp.length;i++) {
            for(int j=1;j<dp[i].length;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                if(dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
}
