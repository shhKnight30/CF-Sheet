import java.io.*;
import java.util.*;

public class Chemistry {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] chAr = sc.next().toCharArray();
            int[] freqArr = new int[26];
            for(int i=0;i<n;i++){
                freqArr[(chAr[i]-'a')]++;
            }
            int count = 0;
            for(int i=0;i<26;i++){
                if(freqArr[i]%2!=0){
                    count++;
                }
            }
            if(count>k+1){
                System.out.println("No");
            }else{
                System.out.println("Yes");
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