import java.io.*;
import java.util.*;

public class PermutationSwap {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n =sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int ans = a[0]-1;
            
            for(int i=1;i<n;i++){
                int b = Math.abs(i-a[i]+1);
                ans = hcf(ans,b);
            }
                System.out.println(ans);
            } 
        }

    private static int hcf(int a, int b) {
        if(b>a)return hcf(b, a);
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp ;
        }
        return a;
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