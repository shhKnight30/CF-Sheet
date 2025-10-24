import java.io.*;
import java.util.*;

public class Raspberries {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ops=k;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if(k==4){
                boolean odd = false;
                boolean even = false;
                boolean twEven = false;
                boolean remThree = false;
                for(int i=0;i<n;i++){
                    int rem = a[i]%k;
                    if(rem==0){
                        twEven = true;
           
                    }else if(rem==1){
                        odd= true;
                    }else if(rem ==2 && even){
                        twEven= true;
               
                    }else if(rem ==2){
                        even = true;
                    }else if(rem ==3){
                        remThree = true;
                    }
                    if(twEven)break;
                }
                if(twEven){
                    ops= 0;
                }else if(remThree || (even&&odd)){
                    ops = 1;
                }else{
                    ops =2;
                }
            }else{
                for(int i=0;i<n;i++){
                    int rem = a[i]%k;
                    if(rem==0){
                        ops=0;
                        break;
                    }else{
                        int diff = k - rem;
                        ops = Math.min(diff,ops);
                    }
                }
            }
            System.out.println(ops);
        }
    }

    // Fast input reader
    static class FastReader {
        private final BufferedReader br;
        private StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
