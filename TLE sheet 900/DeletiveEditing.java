import java.io.*;
import java.util.*;

public class DeletiveEditing {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        while (n-- > 0) {
            StringBuilder s = new StringBuilder(sc.next());
            StringBuilder t = new StringBuilder(sc.next());
            s.reverse();
            t.reverse();
            boolean[] hashS = new boolean[26];
            int i = 0;
            int j = 0;

            while(i<s.length() && j<t.length() ){

                int chart = t.charAt(j)-'A'; 
                int chars = s.charAt(i)-'A';
                if(hashS[chart]){
                    break;
                }else{
                    if(chars==chart){
                        i++;
                        j++;
                        hashS[chars] = false;
                    }else{
                        hashS[chars] = true;
                        i++;
                    }
                }
                
            }
            if(j>=t.length()){
                System.out.println("Yes");
            }else{
                System.out.println("No");
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