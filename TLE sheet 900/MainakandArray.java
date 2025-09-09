import java.io.*;
import java.util.*;

public class MainakandArray {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            int min = 1000;
            int max = nums[0];
            for(int i=0;i<n;i++) {
                nums[i] = sc.nextInt();
                min = Math.min(min,nums[i]);
                max = Math.max(max,nums[i]);
            }
            if(n==1){
                System.out.println(0);
                continue;
            }
            int ans = 0;
            ans = Math.max(ans,max-nums[0]);
            ans = Math.max(ans,nums[n-1]-min);
            for(int i=0;i<n-1;i++){
                ans = Math.max(ans, nums[i]-nums[i+1]);
            }   

            System.out.println(ans);
            
            //     if(i>0 && maxAns<Math.abs(nums[i]-nums[i-1]))maxAns = Math.abs(nums[i]-nums[i-1]);
            //     if(nums[max]<nums[i])max = i;
            //     if(nums[i]<nums[min])min = i ;
            // }
            // // if(Math.abs(min-max)<=1){
            // //     System.out.println(nums[max]-nums[min]);
            // // }else{
            //     System.out.println(Math.max(maxAns,Math.max(nums[max]-nums[0],nums[n-1]-nums[min])));
            // // }
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