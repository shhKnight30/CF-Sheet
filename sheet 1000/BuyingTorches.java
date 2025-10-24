import java.util.*;
import java.io.*;

public class BuyingTorches {
  static class Pair {
    long val1;
    long val2;
    public Pair(long val1,long val2){
       this.val1 = val1;
        this.val2 = val2;
    }
}
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            long x =sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();
            long ops = 0;
            long sticks_gained = x-1;
            long totalReqSticks = k*y+k-1;
            ops+=ceil(totalReqSticks,sticks_gained);
            ops+=k;
            System.out.println(ops);
        }
    }
    public static long ceil(long a,long b){
        return (a+b-1)/b;
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