import java.util.*;
import java.io.*;

public class DoubleendedStrings {
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
            String a = sc.next();
            String b = sc.next();
            System.out.println(fn(a,b));
        }
    }
    public static int fn(String a , String b){
        int an = a.length();
        int bn = b.length();

        if(an>bn){
            return fn(b,a);
        }
        int max = 0;
        for(int i=0;i<bn;i++){
            // boolean minus = false;
            for(int j=0;j<an;j++){
                char cb = b.charAt(i);
                char ca = a.charAt(j);

                if(ca==cb){
                    // minus = true;
                    int length =0;
                    int ii = i;
                    int jj = j;
                    while(jj<an && ii<bn && ca==cb){
                        ii++;
                        jj++;
                        length++;
                        if(jj<an)ca = a.charAt(jj);
                        if(ii<bn)cb = b.charAt(ii);
                    }
                    max = Math.max(length,max);
                }

            }
            // if(minus)i--;
        }
        return an+bn-2*max ;
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