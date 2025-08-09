import java.io.*;
import java.util.*;

public class Desorting {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean unsorted = false;
            int mindiff = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();

                if(i>0){
                    mindiff = Math.min(mindiff,a[i]-a[i-1]);
                }
            }
            if(mindiff<0){
                System.out.println(0);
                continue;
            }

            System.out.println(mindiff/2+1);
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