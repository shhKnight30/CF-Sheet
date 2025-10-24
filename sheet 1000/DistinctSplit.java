import java.io.*;
import java.util.*;

public class DistinctSplit {
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
            int n =sc.nextInt();
            String str= sc.next();
            Set<Character> a = new HashSet<>();
            int fa= 0;
            Map<Character,Integer> b = new HashMap<>();
            int fb=0;
            for(int i=0;i<n;i++){
                char ch = str.charAt(i);
                if(b.containsKey(ch)){
                    b.put(ch, b.get(ch)+1);
                }else{
                    b.put(ch, 1);
                }
            }
            fb = b.size();
            int maxf = fb;
            for(int i=0;i<n;i++){
                char ch = str.charAt(i);
                if(!a.contains(ch)){
                    fa++;
                    a.add(ch);
                }
                b.put(ch,b.get(ch)-1);
                if(b.get(ch)==0)fb--;
                maxf = Math.max(fa+fb,maxf);
            }
            System.out.println(maxf);
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