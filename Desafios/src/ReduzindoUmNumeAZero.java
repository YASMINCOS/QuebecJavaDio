import java.util.Scanner;

public class ReduzindoUmNumeAZero {

	 public static void main(String[] args)
	    {
	        int num = new Scanner(System.in).nextInt();
	        var step = 0;

	        while (num != 0)
	        {
	            if(num % 2 == 0) num/=2;
	            else num--;
	            step++;
	        }
	         System.out.println(step);
	    }
}
