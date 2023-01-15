import java.util.*;
public class a9_q9 {
      /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            int originaln1 = n1;
            int originaln2 = n2;
            while(n1%n2 != 0){
                int remainder = n1%n2;
                n1 = n2;
                n2 = remainder;
                
            }
            int gcd = n2;
            int lcm = (originaln1*originaln2)/gcd;
            System.out.println(gcd);
            System.out.println(lcm);
        }
     }
    }
