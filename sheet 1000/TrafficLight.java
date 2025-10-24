import java.util.*;
import java.io.*;

public class TrafficLight {
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
            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
            String s = sc.next();
            if(ch=='g'){
                System.out.println(0);
                continue;
            }
            int[] hashArray = new int[n];
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='g'){
                    int j = i-1;
                    int count = 1;
                    while(j>=0 && s.charAt(j)!='g'){
                        hashArray[j] = count;
                        j--; 
                        count++;
                    }
                }
                if(i==n-1 && s.charAt(i)!='g'){
                    int j = i;
                    int count = hashArray[0]+1;
                    while(j>=0 && s.charAt(j)!='g'){
                        hashArray[j] = count;
                        j--; 
                        count++;
                    }
                }
            }
            // for(int i : hashArray){
            //     System.out.print(i+" ");
            // }
            int maxl=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)==ch){
                    maxl = Math.max(maxl, hashArray[i]);
                }
            }
            System.out.println(maxl);
            // for(int i=0;i<n;i++){
            //     char chc = s.charAt(i);
            //     if(chc==ch){
            //         int j = i;
            //         int l = 0;
            //         while(s.charAt(j%n)!='g'){
            //             j++;
            //             l++;
            //         }

            //         maxl = Math.max(l,maxl);
            //     }
            // }
            // System.out.println(maxl);
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