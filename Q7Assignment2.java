import java.util.*;

public class a7_q7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (var scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            for (int i =1 ; i<=n;i++){
                for (int j=1;j<=i ;j++){
                    if (j==i){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                   
                }
                 System.out.println();
            }
        }
    }
}
        
