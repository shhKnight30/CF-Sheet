import java.util.*;
import java.io.*;

public class RoofConstruction {
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
            int n = sc.nextInt();
            int powLimMax = (int) Math.pow(2,((int)(Math.log(n-1)/Math.log(2))));
            int[] a = new int[n];
            int num = n-1;
            int i=0;
            while(num>=powLimMax && i<n){
                a[i]= num;
                num--;
                i++;
            }   
            num = 0;
            while(i<n){
                a[i]=num;
                num++;
                i++;
            }
            for( int j:a){
                System.out.print(j+" ");
            }
            System.out.println();
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