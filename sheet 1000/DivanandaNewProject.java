import java.util.*;
import java.io.*;

public class DivanandaNewProject {
  static class Pair<U,V> {
    U val1;
    V val2;
    public Pair(U val1,V val2){
       this.val1 = val1;
        this.val2 = val2;
    }
}
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] time = new long[n];
            for(int i=0;i<n;i++){
                time[i] = sc.nextLong();
            }
            List<Pair<Long,Integer>> list = new ArrayList<>(); 
            for(int i=0;i<n;i++){
                list.add(new Pair<>(time[i],i));
            }
            Collections.sort(list,(x,y)->Long.compare(y.val1,x.val1));
            long val =1 ;
            long curr = 0;
            long timeTaken = 0;
            int[] buildingCords = new int[n+1];
            for(int i=0;i<n;i++){
                curr += (i%2==0) ? val : -val;
                buildingCords[list.get(i).val2+1]= (int)curr; 
                    val++;
                    timeTaken += 2* Math.abs(curr)*list.get(i).val1;
            }
            System.out.println(timeTaken);
       
            for(int i: buildingCords){
                System.out.print(i+" ");
            }
            System.out.println();
            
            // long val= 1;
            // long curr = 0;
            // long timetaken = 0;
            // for(int i=n-1;i>=0;i--){
            //     // if(map.containsKey(timeCopy[i])){
            //     //     List<Long> list = map.get(timeCopy[i]);
            //     //     list.add(curr);
                    
            //     //     map.put(timeCopy[i],list);
            //     // }else{
            //     //     List<Long> list = new ArrayList<>();
            //     //     list.add(curr);
            //     //     map.put(timeCopy[i],list);
            //     // }
            //     list.add(new Pair(time[n-1], curr));
            // }
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