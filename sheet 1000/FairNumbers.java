import java.util.*;
import java.io.*;

public class FairNumbers {
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
            long n = sc.nextLong();
            long MAX = Long.MAX_VALUE;
            while(n<MAX){
                long cpn = n;
                boolean allTrue= true;
                while(cpn>0){
                    long m = cpn%10;
                    if(m!=0 && m!=1 && n%m!=0){
                        allTrue= false;
                        break;
                    }
                    cpn/=10;
                }
                if(allTrue)break;
                n++;
            }
            
            System.out.println(n);
        }
    }
    // public static long hcf(long a,long b){
    //     if(b>a)return hcf(b, a);
    //     while(b>0){
    //         long temp= b;
    //         b = a%b;
    //         a = temp; 
    //     }
    //     return  a;
    // }
    // public static long lcm(long a,long b){
    //     return (a*b)/hcf(a, b);
    // }
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