import java.util.*;

public class a3_q3 {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
          int n = scn.nextInt();

          int nspaces = n - 1;
          int nstars = 1;

          for (int i = 1; i <= n; i++) {
              for (int j = 1; j <= nspaces; j++) {
                  System.out.print("\t");
              }

              for (int j = 1; j <= nstars; j++) {
                  System.out.print("*\t");
              }

              nspaces--;
              nstars++;
              System.out.println();
          }
        }

    }
}
