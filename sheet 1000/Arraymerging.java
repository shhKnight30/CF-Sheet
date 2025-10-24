import java.io.*;
import java.util.*;

public class Arraymerging {
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
            long[] a = new long[n];
            long[] b = new long[n];
            long maxLength = 0;
            for(int i=0;i<n;i++)a[i] = sc.nextLong();
            for(int i=0;i<n;i++)b[i] = sc.nextLong();

            long[] am = new long[2*n+1];
            long[] bm = new long[2*n+1];
            int l = 1;
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1])l++;
                else{
                    am[(int)a[i-1]] = Math.max(l,am[(int)a[i-1]]);
                    l=1;
                }
            }
            am[(int)a[n-1]] = Math.max(l,am[(int)a[n-1]]);
            l = 1;
            for(int i=1;i<n;i++){
                if(b[i]==b[i-1])l++;
                else{
                    bm[(int)b[i-1]] = Math.max(l,bm[(int)b[i-1]]);
                    l=1;
                }
            }
            bm[(int)b[n-1]] = Math.max(l,bm[(int)b[n-1]]);
            

            for(int i=0;i<2*n+1;i++){
                maxLength = Math.max(maxLength, am[i]+bm[i]);
            }
            System.out.println(maxLength);
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

/**\
 * import java.util.*;

public class ArrayMerging {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read the length of arrays a and b

			// Read array a
			long[] a = new long[(int) n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong();
			}

			// Read array b
			long[] b = new long[(int) n];
			for (int i = 0; i < n; i++) {
				b[i] = scanner.nextLong();
			}

			// Arrays to store the longest subarray of equal values for each possible value in a and b
			long[] longestSubarrayA = new long[(int) (2 * n + 1)];
			long[] longestSubarrayB = new long[(int) (2 * n + 1)];

			long counter = 1; // Counter to track the length of current subarray of equal values

			// Calculate the longest subarray of equal values in array a
			for (int i = 1; i < n; i++) {
				if (a[i] == a[i - 1]) {
					counter++;
				} else {
					// Update the longest subarray length for the current value
					longestSubarrayA[(int) a[i - 1]] = Math.max(longestSubarrayA[(int) a[i - 1]], counter);
					counter = 1; // Reset counter for the next sequence
				}
			}
			// Update for the last sequence in array a
			longestSubarrayA[(int) a[(int) (n - 1)]] = Math.max(longestSubarrayA[(int) a[(int) (n - 1)]], counter);

			counter = 1; // Reset counter for array b

			// Calculate the longest subarray of equal values in array b
			for (int i = 1; i < n; i++) {
				if (b[i] == b[i - 1]) {
					counter++;
				} else {
					// Update the longest subarray length for the current value
					longestSubarrayB[(int) b[i - 1]] = Math.max(longestSubarrayB[(int) b[i - 1]], counter);
					counter = 1; // Reset counter for the next sequence
				}
			}
			// Update for the last sequence in array b
			longestSubarrayB[(int) b[(int) (n - 1)]] = Math.max(longestSubarrayB[(int) b[(int) (n - 1)]], counter);

			long maxFreq = -1; // Variable to store the maximum length of subarray of equal values

			// Calculate the maximum length of subarray of equal values across both arrays
			for (int i = 1; i <= 2 * n; i++) {
				maxFreq = Math.max(maxFreq, longestSubarrayA[i] + longestSubarrayB[i]);
			}

			System.out.println(maxFreq); // Output the result for the current test case
		}
		scanner.close();
	}
}

// Time Complexity (TC): O(n) ~ O(2*10^5)
// Space Complexity (SC): O(n) ~ O(2*10^5)

 */