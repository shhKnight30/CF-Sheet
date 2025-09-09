import java.io.*;
import java.util.*;

public class Multiplyby2divideby6 {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if(n==1){
                System.out.println(0);
                continue;
            }
            int count3 = 0;
            long number = n ;
            if(n%3!=0){
                System.out.println(-1);
                continue;
            }
            while(number%3==0){
                count3++;
                number/=3;
            }
            int twos = (int)(Math.log(number)/Math.log(2));    
            if(number!=Math.pow(2,twos)  || twos>count3){
                System.out.println(-1);
                continue;
            }
            twos = count3-twos;
            System.out.println(count3+twos);
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