
import java.io.*;
import java.util.*;

public class Forked {

    static class Pair {

        int i;
        int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int kx = sc.nextInt();
            int ky = sc.nextInt();
            int qx = sc.nextInt();
            int qy = sc.nextInt();
                int[] dx = {a, a, -a, -a, b, b, -b, -b};
            int[] dy = {b, -b, b, -b, a, -a, a, -a};
            Pair[] movesK = new Pair[8];
            Pair[] movesQ = new Pair[8];


            for (int i = 0; i < 8; i++) {
                movesK[i] = new Pair(kx + dx[i], ky + dy[i]);
                movesQ[i] = new Pair(qx + dx[i], qy + dy[i]);
            }

            int count = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (movesK[i].i == movesQ[j].i && movesK[i].j == movesQ[j].j) {
                        count++;
                    }
                }
            }
            if(a==b)count/=4;
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
