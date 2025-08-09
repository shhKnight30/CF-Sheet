
import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(map.containsKey(a[i])){
                    map.put(a[i], map.get(a[i])+1);
                }else{
                    map.put(a[i],1);
                }
            }
            if(n==2){
                System.out.println("yes");
                continue;
            }
            if(map.size()>2){
                System.out.println("No");
            }else if(map.size()==1){
                System.out.println("yes");
            }else{
                List<Integer> valList = new ArrayList<>(map.values());
                // Collections.sort(valList);
                
                if(valList.get(0)+1==valList.get(1) ||valList.get(1)+1==valList.get(0) || valList.get(0)==valList.get(1)){
                    System.out.println("yes");
                }else{
                    System.out.println("No");
                }
            }
            
            
        }
    }
}
