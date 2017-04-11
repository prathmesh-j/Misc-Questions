/**
 * Find the longest increasing subsequence for in the given array
 * {3,4,-1,0,6,2,3}
 * Ans -> 4 (-1,0,2,3)
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] array = {3,4,-1,0,6,2,3};
        System.out.println(getLongestSubsequenceLength(array));

    }

    public static int getLongestSubsequenceLength(int[] array){
        int[] lsl = new int[array.length];
        int max = 0;

        for (int a=0;a<lsl.length;a++) {
         lsl[a] = 1;
        }

        for (int i=1;i<array.length;i++) {
            for(int j=0;j<i;j++) {
                if(array[j]<array[i]) {
                    lsl[i] = Math.max(lsl[i], lsl[j] + 1);
                }
            }
        }

        for(int b=0;b<lsl.length;b++){
            if(lsl[b] > max)
                max = lsl[b];
        }

        return max;
    }
}
