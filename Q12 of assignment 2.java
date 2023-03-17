import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int val1=0;
        int val2=1;
        for (int i =1; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print(val1+"\t");
                int val3=val1+val2;
                val1=val2;
                val2=val3;
            }
            System.out.println();
        }

    }
}
