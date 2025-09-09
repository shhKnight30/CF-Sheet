import java.io.*;
import java.util.*;

public class BadBoy {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n =  sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            int j  = sc.nextInt();
            int zz = Math.abs(i-1)+Math.abs(j-1);
            int zc = Math.abs(i-1)+Math.abs(j-m);
            int rz = Math.abs(i-n)+Math.abs(j-1);
            int rc = Math.abs(i-n)+Math.abs(j-m);
            
            // System.out.println("Ans Start");
            System.out.println(1+" "+1+" "+n+" "+m);
            // System.out.println("Ans End");
            
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