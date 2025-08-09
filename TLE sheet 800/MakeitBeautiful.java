import java.util.*;
import java.io.*;

public class MakeitBeautiful {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n/2;i++){
                int temp = a[i];
                a[i]=a[n-i-1];
                a[n-i-1] = temp;
            }
            boolean isResolved = true;
            int prefixSum = a[0];
            for(int i=1;i<n;i++){
                if(prefixSum==a[i]){
                   isResolved  = resolve(a,i);
                    break;
                }
                prefixSum+=a[i];
            }
            if(isResolved){
                System.out.println("Yes");
                for(int num:a){
                    System.out.print(num +" ");
                }
            }else{
                System.out.println("No");
            }
        }
    }
    public static boolean resolve(int[] a,int index ){
        int num = a[index];
        int i = index;
        while(i<a.length){
            if(a[i]!=num){
                int temp = a[i];
                a[i] = num;
                a[index] = temp ;
                return true;
            }
            i++;
        }
        return false;
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