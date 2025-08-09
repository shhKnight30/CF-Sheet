
import java.util.Scanner;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean isOne=false ;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
                if(arr[0]==1){
                    isOne =true;
                }
            }
            if(isOne){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
