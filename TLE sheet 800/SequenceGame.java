
import java.io.*;
import java.util.*;

public class SequenceGame {

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i]= sc.nextInt();
            }
            List<Integer> list = new ArrayList<>();
            list.add(b[0]);
            for(int i=1;i<n;i++){
                if(b[i-1]>b[i]){
                    list.add(b[i]);
                }
                list.add(b[i]);
            }
            // list.add(sc.nextInt());
                // List<Integer> a = new ArrayList<>();
            // a.add(list.get(0));
            // for (int i = 1; i < list.size(); i++) {
            //     if (list.get(i) < list.get(i - 1)) {
            //         a.add(list.get(i));
            //     }
            //     a.add(list.get(i));
            // }
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

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
