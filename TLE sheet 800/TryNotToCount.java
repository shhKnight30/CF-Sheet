
import java.util.Scanner;

public class TryNotToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            StringBuilder sb = new StringBuilder(x);
            String s = sc.next();
            int count = 0;
            if(x.contains(s)){
                System.out.println(count);
                continue;
            }
            while(n<m){
                sb.append(sb);
                count++;
                n+=n;
            }
            if(sb.toString().contains(s)){
                System.out.println(count);
                continue;
            }
            count++;
            sb.append(sb);
            if(sb.toString().contains(s)){
                System.out.println(count);
                continue;
            }
            System.out.println(-1);
        }
    }
}
