import java.io.*;
import java.util.*;

public class AvtoBus {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if(n<4 || n%2!=0){
                System.out.println(-1);
            }else{
                long max = n/4;
                long min = n/6 + ((n%6==4)? 1:0) + ((n%6==2)?1:0) ; 
                System.out.println(min+" "+max);
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

// public class AvtoBus {
//     public static void main(String[] args) {
//         long x = 998244353998244352L;
//         System.out.println(x);
//     }
// }