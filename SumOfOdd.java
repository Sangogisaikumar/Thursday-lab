package basicprogram;
import java.util.*;
public class SumOfOdd {

	public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
			    int num,i,sum=0;
				System.out.println("Enter the number ");
				num= sc.nextInt();
				
				for (i=1;i<=num;i+=2)
				{
				    //if (i%2 != 0)
				    sum = sum+i;
				
				} 
				System.out.println("Odd sum is "+sum);
		
		
	}

}
