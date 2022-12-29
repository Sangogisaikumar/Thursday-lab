package basicprogram;
import java.util.*;
public class ProductOfNatural {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
		  int num,i,product=1;
		  System.out.println("Enter the number ");
		  num= sc.nextInt();
				
		for (i=1;i<=num;i++)
		 {
		    product = product*i;
		 } 
		System.out.println("The product of your given number is "+product);
		
		
	}

}
