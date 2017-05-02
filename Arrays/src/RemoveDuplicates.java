/**
 * Created by prathmeshjakkanwar on 4/27/17.
 */
public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] duplicateSortedAr){

        int i=0, j=1;

        if(duplicateSortedAr.length < 2){ //means there is only one element in array.
            return duplicateSortedAr;
        }

        while(j < duplicateSortedAr.length){
            if(duplicateSortedAr[j] == duplicateSortedAr[i]) {
                System.out.println("if - " + j);
                j++;
            }
            else{
                duplicateSortedAr[++i] = duplicateSortedAr[j++];
            }
        }

        int[] nonDuplicateSortedAr = new int[i+1];
        for(int x=0; x<nonDuplicateSortedAr.length; x++){
            nonDuplicateSortedAr[x] = duplicateSortedAr[x];
        }

        return nonDuplicateSortedAr;
    }

    public static void main(String[] args) {
        int[] duplicateSortedAr = {1,1,3,7,8,8,9,14,16,16,17,17};
        int[] nonDuplicateSortedAr = removeDuplicates(duplicateSortedAr);

        System.out.println();
        System.out.print("Displaying contents of sorted array(with non-duplicate elements) : ");
        for(int i=0;i<nonDuplicateSortedAr.length;i++){
            System.out.print(duplicateSortedAr[i]+" ");
        }
    }
}
