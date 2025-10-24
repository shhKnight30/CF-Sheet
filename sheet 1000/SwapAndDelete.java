import java.io.*;
import java.util.*;

public class SwapAndDelete {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            char charCheck = '0';
            String s = sc.next();
            int length = s.length();
            int count = 0;
            for(int i=0;i<length;i++){
                if(s.charAt(i)=='0')count++;
            }
            if(count > length/2 ){
                charCheck='1';
                count = length - count;
            }
            
            if(count == length-count){
                System.out.println(0);
            }else{
                for(int i=0;i<length && count>=0;i++){
                    if(charCheck!=s.charAt(i))count--;
                    if(count<0){
                        count = length-i;
                        break;
                    }
                }
                System.out.println(count);
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