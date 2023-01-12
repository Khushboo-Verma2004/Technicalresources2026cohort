import java.util.*;
  
  public class a3_q3{
  
  public static void main(String[] args) {
      try (Scanner scn = new Scanner(System.in)) {
        int t=scn.nextInt();
           for (int i=0 ; i<t;i++){
               int n=scn.nextInt();
               int count=0;
               for(int div=1;div<=n;div++){
                   if (n%div==0){
                       count++;
                   }
           }
  if (count==2){
          System.out.println("The number is prime.");
  }else {
          System.out.println("The number is not prime.");
  }

  }
    }
   }
  }
