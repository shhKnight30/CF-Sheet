import java.util.*;
import java.io.*;

public class ShoeShuffling {
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
            int[] a = new int[n];
            int MAX = (int)1e9;
            // System.out.println(MAX);
            // int[] hash = new int[MAX];
            HashMap<Integer,Integer> hash = new HashMap<>(); 
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt(); 
                if(hash.containsKey(a[i])){
                    hash.put(a[i],hash.get(a[i])+1);
                }else{
                    hash.put(a[i], 1);
                }
            }
            boolean check = false;
            for(int i=0;i<n;i++){
                if(hash.get(a[i])==1){
                    check = true;
                }
            }
            if(check){
                System.out.println(-1);
            }else{
                int[] arr = new int[n];
                int val = 1;
                arr[0] = hash.get(a[0]);
                for(int i=1;i<n;i++){
                    if(a[i]!=a[i-1]){
                        arr[i] = val+hash.get(a[i]);
                    }else{
                        arr[i]= val;
                    }
                    val++;
                }
                for(int i:arr){
                    System.out.print(i+" ");
                }
                System.out.println();
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