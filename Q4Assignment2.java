import java.util.*;

public class a4_q4 {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)){
            int n = scn.nextInt();
            int stars = n;
            int spaces = 0;
            for (int i=1; i<=n;i++){
                   for (int j=1;j<=spaces;j++){
                    System.out.print("\t");
                }
                for (int j=1; j<=stars;j++){
                    System.out.print("*\t");
                }
                System.out.println();
             
                
                spaces++;
                stars--;
            }
        }
    }
}
