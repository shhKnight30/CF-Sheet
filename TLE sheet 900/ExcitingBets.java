import java.io.*;
import java.util.*;

public class ExcitingBets {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            // if(a==0 && b==0){
            //     System.out.println(a+" "+b);
            //     continue;
            // }
            long gcd  = Math.abs(a-b);
            if(gcd==0){
                System.out.println(0 +" "+0);
                continue;
            }
            a = Math.max(a,b);
            a = (a-gcd)%gcd;

            
            long minOp = Math.min(a,gcd-a);
            // while(a%gcd!=0 && b%gcd!=0){
            //     a++;
            //     count++;
            //     if(b>0){
            //         b--;
            //     }
            // }
            System.out.println(gcd +" "+minOp);
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