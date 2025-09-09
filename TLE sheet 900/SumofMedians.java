import java.io.*;
import java.util.*;

public class SumofMedians {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long medSum = 0;
            long[][] a = new long[k][n];
            for(int j=0;j<((n+1)/2)-1;j++){
                for(int i=0;i<k;i++){
                    a[i][j] = sc.nextLong();
                }
            }
            for(int i=0;i<k;i++){
            for(int j=((n+1)/2)-1;j<n;j++){
                a[i][j] = sc.nextLong();
                if(j==((n+1)/2)-1){
                    medSum+=a[i][j];
                }
                }
            }
            // for(int i=0;i<k;i++){
            //     for(int j=0;j<n;j++){
            //         System.out.print(a[i][j]+"  ");
            //     }
            //     System.out.println();
            // }
            // System.out.println("\n\n\n");
            System.out.println(medSum);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}