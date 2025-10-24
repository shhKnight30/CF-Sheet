import java.util.*;
import java.io.*;

public class BeautifulArray {
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
            int k = sc.nextInt();
            long b = sc.nextLong();
            long s = sc.nextLong();
            long[] a = new long[n];
            if(s>=k*b && s<=((k-1)*(long)n+k*b)){
                a[0] = k*b;
                long diff = s-k*b;
                int i=0;
                while(i<n && diff>0){
                    if(diff<k-1){
                        a[i]+=diff;
                    }else{
                        a[i]+=k-1;
                    }
                    i++;
                    diff-=k-1;
                }
                for(long j: a){
                    System.out.print(j +" ");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }
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