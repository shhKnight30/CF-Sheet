import java.io.*;
import java.util.*;

public class CoverinWater {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
           int n = sc.nextInt();
        //    boolean foundThreeCTS = false;
           int count = 0;
           int magic = 3;
           String str = sc.next();
           for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='.'){
                count++;
                magic--;
                if(magic==0){
                    break;
                }
            }else{
                magic=3;
            }
           }
           if(magic==0){
            System.out.println(2);
            continue;
           }
            
           System.out.println(count);
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