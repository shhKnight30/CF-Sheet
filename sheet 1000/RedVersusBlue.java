import java.util.*;
import java.io.*;

public class RedVersusBlue {
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
            int r = sc.nextInt();
            int b = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<b;i++){
                sb.append('B');
            }
            StringBuilder sbr = new StringBuilder();
            
            int rseglen = r/(b+1) ;
            for(int i=0;i<rseglen;i++){
                sbr.append('R');
            }
            for(int i=0;i<sb.length();i+=rseglen+1){
                sb.insert(i, sbr);
            }
            sb.append(sbr);
            int rRem = r%(b+1);
            int i=0;
            while(i<n && rRem-->0){
                sb.insert(i,'R');
                i+=rseglen+2;
            }
            // System.out.println();
            System.out.println(sb.toString());
            // while(i<rRem){

            // }

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