import java.io.*;
import java.util.*;

public class MakeAP {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            boolean isValid = false;
            if((x+z)%2==0){
                long newY = (x+z)/2;
                if(newY>0 && newY%y==0)isValid= true;
            }
            long newX = 2*y - z;
            if(newX>0 && newX%x==0)isValid= true;
            long newZ = 2*y - x;
            if(newZ>0 && newZ%z==0)isValid= true;
            if(isValid){
                System.out.println("yes");
            }else{
                System.out.println("no");
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