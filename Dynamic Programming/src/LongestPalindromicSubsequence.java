/**
 * Given a string s, find the longest palindromic subsequence's length in s.
 * You may assume that the maximum length of s is 1000.
 */
public class LongestPalindromicSubsequence {

    public static void main(String[] args) {
        System.out.println(getLengthOfLongestPalindromicSubseqence("bbbab"));

    }

    public static int getLengthOfLongestPalindromicSubseqence(String str) {
        int[][] dp = new int[str.length()][str.length()];
        for (int i = str.length() - 1; i >= 0; i--) { // move from right to left
            dp[i][i] = 1; // ---> mark the diagonals as 1
            for (int j=i+1;j<str.length();j++) { // move from left to right
                if(str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][str.length()-1];
    }
}
