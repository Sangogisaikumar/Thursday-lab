package basicprogram;

public class Studusingmethod {
	int id;
	String name,address;
	long phno;
	float marks;
	void setdata(int i,String n,String a,long p,float m) {
		 id=i;
	     name=n;
		 address=a;
		 phno=p;
		 marks=m;
	}
	public static void main(String[] args) {
		Studusingmethod saikumar=new Studusingmethod();
		saikumar.setdata(439,"saikumar","hyderabad",7569098913L,80.50F);
		System.out.println(saikumar.id+" "+saikumar.name+" "+saikumar.address+" "+saikumar.phno+" "+saikumar.marks);
	
	}
}
