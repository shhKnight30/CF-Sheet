import java.io.*;
import java.util.*;

public class WeNeedtheZero {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int number =  0 ;
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                number ^= a[i];
            }
            for(int i=0;i<n;i++){
                a[i]^=number;
            }
            int finalNumber = a[0];
            for(int i=1;i<n;i++){
                finalNumber^=a[i];
            }
            
            System.out.println(finalNumber!=0 ? -1 :  number);
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