import java.util.*;
public class a10_q10 {
   
	public static void main(String[] args) {
		try (var scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            
            for(int i = 2; i * i <= n; i++){
                while(n % i == 0){
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
            
            if(n != 1)
                System.out.print(n);
        }
	}
}

