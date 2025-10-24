import java.util.*;
import java.io.*;

public class TrianglesonaRectangle {
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
            int w = sc.nextInt();
            int h = sc.nextInt();
            long max = 0 ;
            for(int i=0;i<2;i++){
                int k = sc.nextInt();
                long diff = 0;
                for(int j=0;j<k;j++){
                    long num = sc.nextLong();
                    if(j==0)diff = -num;
                    if(j==k-1)diff+=num;
                }
                max = Math.max(diff*h,max);
            }
            for(int i=0;i<2;i++){
                int k = sc.nextInt();
                long diff = 0;
                for(int j=0;j<k;j++){
                    long num = sc.nextLong();  
                    if(j==0)diff = -num;
                    if(j==k-1)diff+=num;
                }
                max = Math.max(diff*w,max);
            }
            System.out.println(max);
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