import java.io.*;
import java.util.*;

public class OddQueries {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            int[] prefix = new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                sum+=a[i];
                prefix[i]=sum;
            }

            for(int i=0;i<q;i++){
                int psum = sum;
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    int k = sc.nextInt();
                    l-=1;
                    r-=1;
                    psum += (l>0) ? prefix[l-1]: 0;
                    psum -= prefix[r];
                    psum+= (r-l+1)*k;
                    if(psum%2!=0)System.out.println("Yes");
                    else System.out.println("No");         
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