import java.util.*;
import java.io.*;

public class LukeisaFoodie {
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
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] v = new long[2];
            long[] ai = new long[2];
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            v[0]= a[0]-x;
            v[1]= a[0]+x;
            ai[0] = v[0]-x;
            ai[1] = v[1]+x;
            int count =0;
            for(int i =1;i<n;i++){
                if(a[i]!=a[i-1]){
                    if(a[i]>=ai[0] && a[i]<=ai[1]){
                        long v0 = a[i]-x;
                        long  v1 = a[i]+x;
                        v[0]= Math.max(v[0],v0);
                        v[1]= Math.min(v[1],v1);
                    }else{
                        count++;
                        v[0]= a[i]-x;
                        v[1]= a[i]+x;
                    }
                    ai[0] = v[0]-x;
                    ai[1] = v[1]+x;
                }
            }
            System.out.println(count);
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