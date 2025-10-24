import java.io.*;
import java.util.*;

public class HelmetsinNightLight {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            long cost = 0;
            long[][] ab = new long[n][2];
            for(int j=0;j<2;j++){
                for(int i=0;i<n;i++){
                    ab[i][j] = sc.nextLong();
                }
            }
            Arrays.sort(ab,(a,b)->{
                if(a[1]!=b[1]){
                    return   Long.compare(a[1], b[1]);
                }else{
                    return Long.compare(b[0], a[0]);
                }
            });
            if(p<ab[0][1]){
                cost = (long)n*(long)p;
            }else{
                long remaining = n-1;
                cost = p;
                for(int i=0;i<n;i++){
                    if(ab[i][1]<p){
                        long req = remaining< ab[i][0] ? remaining : ab[i][0];
                        cost+=ab[i][1] * req;
                        remaining-=req;
                    }else{
                        cost+= remaining*p;
                        remaining =0;
                    }
                    if(remaining==0)break;
                }
            }
            System.out.println(cost);
        }
    }
    
    // int[] a = new int[n];
    // Map<Long,Integer> map = new HashMap<>();
    // for(int i=0;i<n;i++){
    //     a[i]=sc.nextInt();
    // }
    // for(int i=0;i<n;i++){
    //     long num =sc.nextLong();
    //     // if(map.containsKey(num)){
    //     //     map.put(num,map.get(num)+a[i]);
    //     // }else{
    //     //     map.put(num,a[i]);
    //     // }
    // }
    // List<Long> costs = new ArrayList<>(map.keySet());
    // Collections.sort(costs);
    // long cost = (long)p;
    // int dn = n-1; 
    // for(int i=0;i<costs.size();i++){
    //     if(costs.get(i)<p){
    //         int numP = dn>map.get(costs.get(i)) ? map.get(costs.get(i)) : dn ;
    //         cost+=costs.get(i)*numP;
    //         dn-=numP;
    //     }else{
    //         cost += dn*p;
    //         dn = 0;
    //     }
    //     if(dn==0)break;
    // }
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