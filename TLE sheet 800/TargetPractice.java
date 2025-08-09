
import java.io.*;
import java.util.*;

public class TargetPractice {

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            String[] target = new String[10];
            int totalPoints = 0;
            for (int i = 0; i < 10; i++) {
                target[i] = sc.next();
            }
            for (int i = 0; i < 10; i++) {
                char[] charArr = target[i].toCharArray();
                for (int j = 0; j < 10; j++) {
                    char ch = charArr[j];
                    if (ch == 'X') {
                        if (i < 5 && j < 5) {
                            totalPoints += Math.min(i, j) + 1;
                        } else if (i < 5 && j >= 5) {
                            totalPoints += Math.min(i, 10 - j - 1)+1;
                        } else if (i >= 5 && j < 5) {
                            totalPoints += Math.min(10 - i - 1, j)+1;
                        } else {
                            totalPoints += Math.min(10 - i - 1, 10 - j - 1)+1;
                        }
                    }
                }
            }
            System.out.println(totalPoints);
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
