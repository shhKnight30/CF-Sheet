import java.util.*;
import java.io.*;

public class BlackandWhiteStripe {
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
            int n =sc.nextInt();
            int k = sc.nextInt();
            String str= sc.next();
            int countW = 0;
            int mincountW = n;
            int i=0;
            
            int j=0;
            while(j<n && j<k){
                char c = str.charAt(j);
                if(c=='W')countW++;
                j++;
            }
            mincountW = Math.min(countW,mincountW);

            if(mincountW==0){
                System.out.println(0);
                continue;

            }
            while(j<n){
                char c = str.charAt(j);
                if(c=='B' && str.charAt(i)=='W'){
                    countW--;
                    
                }else if(c=='W'&& str.charAt(i)=='B'){
                    countW++;
                }
                i++;
                j++;
                mincountW = Math.min(countW,mincountW);
            }
            System.out.println(mincountW);
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