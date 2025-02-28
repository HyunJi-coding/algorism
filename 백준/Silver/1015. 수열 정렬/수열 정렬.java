import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Integer[] index = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            index[i] = i;
        }

        Arrays.sort(index, Comparator.comparingInt(i -> arr[i]));

        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[index[i]] = i;
        }

        for (int i : p) {
            System.out.print(i + " ");
        }
    }
}
