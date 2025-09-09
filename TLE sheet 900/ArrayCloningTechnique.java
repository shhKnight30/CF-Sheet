import java.io.*;
import java.util.*;

public class ArrayCloningTechnique {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer,Integer> map  = new HashMap<>();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                a[i] = num;
                if(map.containsKey(num)){
                    map.put(num, map.get(num)+1);
                }else{
                    map.put(num,1);
                }
            }

            int maxOcc = 0;
            for(int i:a){
                if(map.get(i)>maxOcc){
                    maxOcc=map.get(i);
                }
            }
            int count =0;
            int vac = n - maxOcc;
            while(maxOcc<n){
                count++;
                maxOcc*=2;
            }
            while(vac>0){
                count++;
                vac--;
            }

            System.out.println(count);
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