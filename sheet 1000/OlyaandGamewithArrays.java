import java.util.*;
import java.io.*;

public class OlyaandGamewithArrays {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            List<Long> secMins = new ArrayList<>();
            int n = sc.nextInt();
            long minOfAll = Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                int size = sc.nextInt();
                long min = Long.MAX_VALUE;
                long smin = Long.MAX_VALUE;
                for(int j=0;j<size;j++){
                    long num = sc.nextLong();
                    if(num<=min){
                        smin = min;
                        min = num;
                    }else if(num>min && num<smin){
                        smin = num;
                    }
                }
                minOfAll = Math.min(min, minOfAll);
                secMins.add(smin);
            }

            long TotalValue = minOfAll;

            if(n!=1){
                minOfAll = secMins.get(0);
                for(int i=0;i<secMins.size();i++){
                    TotalValue+=secMins.get(i);
                    minOfAll = Math.min(minOfAll, secMins.get(i));
                }
                TotalValue-=minOfAll;
            }
            System.out.println(TotalValue);
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