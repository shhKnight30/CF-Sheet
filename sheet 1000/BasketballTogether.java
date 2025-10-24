import java.util.*;
import java.io.*;

public class BasketballTogether {
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
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n = sc.nextInt();
            long D = sc.nextLong();
            Long[] p = new Long[n];
            for(int i=0;i<n;i++){
                p[i] = sc.nextLong();
            }
            Arrays.sort(p,(a,b)->Long.compare(b,a));
            long sum = p[0];
            int i = 0;
            int j = n-1;
            long count =0;
            while(j>=i){
                if(sum<=D){
                    if(i!=j){
                        sum+=p[i];
                    }
                    j--;
                }else{
                    count++;
                    i++;
                    if(i<n){
                        sum=p[i];
                    }else{
                        break;
                    }
                }
            }
            
            System.out.println(count);

        // }
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