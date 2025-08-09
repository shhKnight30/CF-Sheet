import java.io.*;
import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            Arrays.sort(a);
            boolean found = false;
            for(int i=1;i<n;i++){
                List<Integer> b = new ArrayList<>();
                List<Integer> c = new ArrayList<>();
                for(int j=0 ;j<i ;j++)b.add(a[j]);
                for(int j=i ;j<n ;j++)c.add(a[j]);
                boolean valid = true;
                for(int x: b){
                    for(int y : c){
                        if(x%y==0){
                            valid = false;
                            break;
                        }
                    }
                    if(!valid)break;
                }
                if(valid){
                    found = true;
                    System.out.println(b.size() + " "+ c.size());
    
                    for(int bi: b){
                        System.out.print(bi+" ");
                    }
                    System.out.println();
                    for(int ci: c){
                        System.out.print(ci+" ");
                    }
                    System.out.println();
                    break;
                }
            
            }
            if(!found){
                System.out.println(-1);
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