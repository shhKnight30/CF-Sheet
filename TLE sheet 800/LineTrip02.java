import java.util.Scanner;

public class LineTrip02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int max = Math.max(2 * (x - a[n - 1]), a[0]);
            for (int i = 1; i < n; i++) {
                max = Math.max(max, a[i] - a[i - 1]);
            }
            System.out.println(max);
        }
    }
}
