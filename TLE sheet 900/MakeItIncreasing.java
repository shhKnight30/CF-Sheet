import java.io.*;
import java.util.*;

public class MakeItIncreasing {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            int ops = 0;
            boolean notPossible = false;

                    for(int i=n-2;i>=0;i--){
                        while(a[i]>=a[i+1]){
                            if(a[i]==0){
                                notPossible= true;
                                break;
                            }
                            a[i]/=2;
                            ops++;
                        }

                        if(notPossible){
                            break;
                        }
                    }
        
            if(notPossible){
                System.out.print(-1);
            }else{
                System.out.print(ops);
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