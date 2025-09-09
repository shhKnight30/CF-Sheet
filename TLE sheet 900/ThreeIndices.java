import java.io.*;
import java.util.*;

public class ThreeIndices {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();           
            int[] arr = new int[n];
            boolean found = false;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int index = 0;
            for(int i=1;i<n-1;i++){
                if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                    index = i;
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Yes");
                System.out.println((index) +" "+(index+1)+" "+(index+2));
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