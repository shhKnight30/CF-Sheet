import java.io.*;
import java.util.*;

public class ABBalance {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            char[] str = sc.next().toCharArray();
            int cab = 0;
            int cba = 0;

            for(int i=1 ;i< str.length;i++){
                if(str[i]=='a' && str[i-1]=='b')cba++;
                if(str[i]=='b' && str[i-1]=='a')cab++;
            }
            
            int i=0;
            while(i<str.length &&   cab!=cba){
                char ch = str[i];
                if(cab>cba){
                    if(ch=='a'){
                        str[i] = 'b';
                        break;
                    }
                }
                if(cba>cab){
                    if(ch=='b'){
                        str[i] = 'a';
                        break;
                    }
                    
                }
                i++;
            }
            StringBuilder sb = new StringBuilder();            
            for(i =0;i<str.length;i++){
                sb.append(str[i]);
            }
            System.out.println(sb.toString());

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