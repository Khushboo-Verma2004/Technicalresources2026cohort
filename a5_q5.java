import java.util.*;
  
  public class a5_q5{
  
  public static void main(String[] args) {
      try (Scanner scn = new Scanner (System.in)) {
        int n = scn.nextInt();
          int x = 0;
          while (n!=0){
              n=n/10;
              x++;
          }
              System.out.println(x);
    }
      
   }
  }
