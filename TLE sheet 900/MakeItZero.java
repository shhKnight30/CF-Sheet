import java.io.*;
import java.util.*;

public class MakeItZero {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int finXor = 0;
            int[] nums = new int[n];
            boolean allZero = true;;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
                if(nums[i]!=0)allZero= false;
                finXor^=nums[i];
            }
            if(allZero){
                System.out.println(0);
            }else if(finXor==0){
                System.out.println(1);
                System.out.println(1+" "+n);
            }else if(n%2==0){
                System.out.println(2);
                System.out.println(1+" "+n);
                System.out.println(1+" "+n);
            }else{
                // int pref = 0;
                // int index = -1;
                // for(int i=0;i<n;i++){
                //     pref^=nums[i];
                //     if(finXor==pref){
                //         index = i;
                //         break;
                //     }
                // }
                System.out.println(4);
                System.out.println(1+" "+(n-1));
                System.out.println(1+" "+(n-1));
                System.out.println((n-1)+" "+n);
                System.out.println((n-1)+" "+n);
            }

            // if(finXor==0){
            //     System.out.println(1);
            //     System.out.println(1+" "+l);
            // }else{
            //     System.out.println(2);
            //     System.out.println(1+" "+l);
            //     System.out.println(1+" "+l);
            // }
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