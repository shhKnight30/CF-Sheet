import java.io.*;
import java.util.*;

public class OddGrasshopper {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            long x0 = sc.nextLong();
            long n = sc.nextLong();
            boolean isX0Even = x0%2==0;
            if(n%4==0){
                System.out.println(x0);
            }else if(n%4==1){
                System.out.println(x0+((isX0Even)?-1:1)*n);
            }else if(n%4==2){
                System.out.println(x0+((isX0Even)?1:-1));
            }else if(n%4==3){
                System.out.println(x0+((isX0Even)?1:-1)*(n+1));
            }
            // if(x0%2==0){
            //     if(n%2==0){
            //         System.out.println(x0-n/2);
            //     }else{
            //         System.out.println(x0-(n+1)/2);
            //     }
            // }else{
            //     if(n%2==0){
            //         System.out.println(x0+n/2);
            //     }else{
            //         System.out.println(x0+(n+1)/2);
            //     }
            // }
            
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