import java.util.*;
import java.io.*;

public class DifferentDivisors {
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
            int d = sc.nextInt();
            int first = 1+d;
            int sec = 1+2*d;
            while(!isPrime(first)){
                first++;
            }
            sec = first+d;
            while(!isPrime(sec)){
                sec++;
            }
            System.out.println(sec*first);


        }
    }
    public static  boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
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