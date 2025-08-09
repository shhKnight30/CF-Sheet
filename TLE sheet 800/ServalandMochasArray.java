import java.io.*;
import java.util.*;

public class ServalandMochasArray {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int gcd = 1 ;
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            boolean found = false;
            for(int i=0;i<n;i++){
                int num = a[i];
                for(int j=i+1;j<n;j++){
                    if(calcGCD(a[j],num)<=2)found = true;
                }
                if(found)break;
            }
            if(found){
                System.out.println("Yes");

            }else{
                System.out.println("No");
            }
            
        }
    }

    private static int calcGCD(int a, int b) {
        while(b!=0){
            int t = b;
            b = a%b;
            a = t;
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