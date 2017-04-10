/**
 * Given a sorted array of integers in increasing order (can contain duplicates), return the last index of a specified
 * target integer, or return -1 otherwise.
 * Thus 1, 2, 2, 3, 4 and the target is 2, the function should return 2
 */
public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4};

        System.out.println(findIndexOfLastDuplicate(array,2));
    }

    public static int findIndexOfLastDuplicate(int[] array, int number) {
        int lastPosition = 0;
        boolean found = false;
        for (int i=0;i<array.length;i++) {
            if(array[i] == number) {
                if (found) {
                    lastPosition = i;
                } else {
                    found = true;
                }
            }
        }
        if (found) {
            return lastPosition;
        }

        return -1;
    }
}
