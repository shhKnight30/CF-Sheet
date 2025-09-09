import java.io.*;
import java.util.*;

public class MakeitDivisibleby25 {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            boolean Five = false;
            boolean Zero = false;
            int countZ = 0;
            int countF = 0;
            long number = n;
            while(number>0){
                long num = number%10;
                    if(Five && (num==7 || num==2)){
                        break;
                    }
                if(!Five && num==5){
                    Five = true;
                }else{
                    countF++;
                }
                number/=10;
            }
            number = n;
            while(number>0){
                long num = number%10;
                if(Zero && (num==5 || num==0)){
                        break;
                    }
                if(!Zero && num==0){
                    Zero = true;
                }else{
                    countZ++;
                }
                number/=10;
            }
            System.out.println(Math.min(countF,countZ));
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