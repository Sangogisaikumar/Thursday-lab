package basicprogram;

public class Swap {
	public static void main(String[] args)
	{
		int a=40,b=60,temp;
		System.out.println("Before swapping,the values are: a="+a+" b="+b);
		/*temp=a;  //temp=10
		a=b; //a=20
		b=temp; //b=10*/
		
		temp=b;
		b=a;
		a=temp;
		System.out.println("After swapping,the values are: a="+a+" b="+b);
	}

}


