/**
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2.
 * (each operation is counted as 1 step.)
 * You have the following 3 operations permitted on a word:
 * a) Insert a character
 * b) Delete a character
 * c) Replace a character
 */
public class EditDistance {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "adhr";
        char[] word1 = s1.toCharArray();
        char[] word2 = s2.toCharArray();

        System.out.println(getMinimumEditDistance(word1, word2));
    }

    public static int getMinimumEditDistance(char[] word1, char[] word2) {
        int[][] dp = new int[word1.length + 1][word2.length + 1];

        for(int i = 0; i <= word1.length; i++)
            dp[i][0] = i;
        for(int i = 1; i <= word2.length; i++)
            dp[0][i] = i;

        for(int i=0;i<word1.length;i++){
            for(int j=0;j<word2.length;j++){
                if(word1[i] == word2[j]){
                    dp[i+1][j+1] = dp[i][j];
                } else {
                    dp[i+1][j+1] = 1 + getMinimum(dp[i][j], dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[word1.length][word2.length];
    }

    public static int getMinimum(int a, int b, int c) {
        return a < b ? (a < c ? a : c) : (b < c ? b : c);

    }
}
