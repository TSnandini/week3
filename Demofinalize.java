package week7;
import java.util.Scanner;
public class Demofinalize 

	

	{
	public static void main(String [] args)
	{
	student1 kabir=new student1();
	kabir.display();
	System.out.println("object reference is ..."+kabir);
	kabir.finalize();
	System.gc();
	System.out.println("object garbage collected");
	}
	}
	class student1
	{
	String name;
	int rno;
	float result;
	Scanner sc= new Scanner(System.in);
	student1()
	{
	System.out.println("enter roll no of student");
	rno=Integer.parseInt(sc.next());
	System.out.println("enter the name of the student");
	name=sc.next();
	System.out.println("enter the result of the student");
	result=Float.parseFloat(sc.next());
	}
	void display()
	{
	System.out.println(rno+"\t"+name+"\t"+result);
	}
	@Override
	protected void finalize()
	{
	sc.close();
	System.out.println("object cleaned up by finalize method");
	}
	

}
