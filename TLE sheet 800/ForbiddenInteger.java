import java.io.*;
import java.util.*;

public class ForbiddenInteger {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if((x==1 && k==2 && n%2!=0) || x==1 && k==1 ){
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
            k = (x!=k) ? k : k-1;
            int count =0;


             if(n%k==x){
                if(x==1){
                    count = n/k+1;
                    System.out.println(count);
                    for(int i=0;i<n/k-1;i++){
                        System.out.print(k + " ");
                    }
                    System.out.print(k-1+" "+2);
                }else{
                    count = n/k +2;
                    System.out.println(count);
                    for(int i=0;i<n/k;i++){
                        System.out.print(k + " ");
                    }
                    System.out.print(n%k-1 + " "+ 1);
                }
            }else{
                count = n%k==0 ? n/k : n/k +1;
                System.out.println(count);
                for(int i=0;i<n/k;i++){
                    System.out.print(k + " ");
                }
                if(n%k!=0)System.out.print(n%k);
        }
        System.out.println();
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