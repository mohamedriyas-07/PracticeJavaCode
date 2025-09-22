package dear;
import java.util.*;

public class movingzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();          // size of array
        int[] arr = new int[n];        // integer array

        // input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // move zeros to the end
        int index = 0; // pointer for non-zero
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        // fill remaining places with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        // print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
