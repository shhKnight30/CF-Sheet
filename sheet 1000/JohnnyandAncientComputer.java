import java.util.*;
import java.io.*;

public class JohnnyandAncientComputer {
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
            long a = sc.nextLong();
            long b = sc.nextLong();
            int ops =0;
            if(a==b){
                System.out.println(0);
            }else{
                if(b>a){
                    if(b%2!=0){
                        System.out.println(-1);
                    }else{
                        while(a*8<b){
                            ops++;
                            a*=8;
                        }
                         if(a*8==b || a*4==b || a*2==b){
                            System.out.println(ops+1);
                        }else{
                            System.out.println(-1);
                        }
                    }
                }else{
                   if(a%2!=0){
                    System.out.println(-1);
                   }else{
                    while(a/8>b && a%8==0){
                            ops++;
                            a/=8;
                        }
                        if(a/8==b && a%8==0 || a/4==b && a%4==0 || a/2==b && a%2==0){
                            System.out.println(ops+1);
                        }else{
                            System.out.println(-1);
                        }
                   }
                }
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