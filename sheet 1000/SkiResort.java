import java.io.*;
import java.util.*;

public class SkiResort {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long q = sc.nextLong();
            long[] daysTemp = new long[n];
            int length = 0;
            long count = 0L;
            for(int i=0;i<n;i++){
                long temp = sc.nextLong();
                if(temp<=q){
                    length++;
                    if(length>=k){
                        count+=length-k+1;
                    }
                }else{
                    length=0;
                }
            }
            System.out.println(count);
        }
    }
    
    static class Pair {
      long val1;
      long val2;
      public Pair(long val1,long val2){
         this.val1 = val1;
          this.val2 = val2;
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