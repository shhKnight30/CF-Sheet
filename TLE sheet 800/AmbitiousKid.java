import java.io.*;
import java.util.*;

public class AmbitiousKid {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
            int n = sc.nextInt();
            int minOps = 100000;        
            for(int i=0;i<n;i++){  
                int a =  sc.nextInt();
                minOps = Math.min(minOps,Math.abs(a));
            }
            System.out.println(minOps);
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