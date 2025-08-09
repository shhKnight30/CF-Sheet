import java.io.*;
import java.util.*;

public class TwoPermutations {
    
    /*
    
    *Case n - (a + b) > 1 → There’s enough room in the middle of the permutations to make them differ while still keeping the required prefix and suffix lengths; so output "Yes".
    * Case n == a && b == n → Both prefix and suffix cover the entire permutation, meaning p and q are identical; this is always possible, so output "Yes".this case holds as if there is gap of one only ie. n-(a+b)=1 then there is a guarentee that that one element should be equal and that means both arrays are same but that makes a longest prefix = n and suffix = n but we have said that a+b is already less than n but in case of a==n and b==n this condition holds that there can exist two permutation which can be same but different list ... 
    
    *Else → If a + b is too large (leaving ≤ 1 free position), it’s impossible to have both conditions satisfied without overlap, so output "No".
     */
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n =sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(n==a && b==n){ ///this case exists because there is no other permutation can exist when a= n and b = n and there shoul
                System.out.println("Yes");
            }else if(n-(a+b)>1){
                    System.out.println("Yes");
            }else{
                System.out.println("No");
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