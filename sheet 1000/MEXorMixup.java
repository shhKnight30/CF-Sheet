import java.util.*;
import java.io.*;

public class MEXorMixup {
  static class Pair {
    long val1;
    long val2;
    public Pair(long val1,long val2){
       this.val1 = val1;
        this.val2 = val2;
    }
}
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // if(a==1&& b==1 ){
            //     System.out.println(3);
            //     continue;
            // }
            int xorr = xor(a-1);
            if(xorr==b){
                System.out.println(a);
            }else if((xorr^b)!=a){
                System.out.println(a+1);
            }else{
                System.out.println(a+2);
            }
            // if(a%4==0){
            //     if(b==0){
            //         System.out.println(a);
            //     } //a>0
            //     else{
            //          System.out.println(a+1);
            //     }
            // }else if(a%4==1){
            //     if(a==b || ((a-1)^b)==a){
            //         System.out.println(a+2);
            //     }
            //     else if(a-1==b){
            //         System.out.println(a);
            //     } 
            //     else{ 
            //         System.out.println(a+1);
            //     }
            // }else if(a%4==2){   
            //     if(a==b){
            //         System.out.println(a+2);
            //     }
            //     if(b==1){
            //         System.out.println(a);
            //     }
            //     else{
            //          System.out.println(a+1);
            //     }
            // }else{
            //     if(b==a){
            //         System.out.println(a);
            //     }
            //     else {System.out.println(a+1);
            //     }
            // }
        }
    }
    public static int xor(int n){
        // n=n%4;
        int a = n%4;
        if(a==0){
            return n;
        }else if(a==1){
            return 1;
        }else if(a==2){
            return n+1;    
        }
        return 0;     
         
    }
    public static int log2(int n){
        return (int) (Math.log(n)/Math.log(2));
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