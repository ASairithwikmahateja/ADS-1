import java.util.Scanner;
import java.util.Arrays;

final class Solution {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrsiz = sc.nextInt();
        int[] array = new int[arrsiz];
        for (int i = 0; i < arrsiz; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int search = sc.nextInt();
        System.out.println(binarySearch(array, 0, array.length - 1, search));
    }
     static boolean binarySearch(final int[] array, final int start, final int end, final int search) {
       if (end >= start)
       {
           int middleValue = start + (end - start) / 2;
           if (array[middleValue] == search) {
              return true;
           }
           if (array[middleValue] > search) {
              return binarySearch(array, start, middleValue-1, search);
           }
           return binarySearch(array, middleValue + 1, end, search);
       }
       return false;
   }
}