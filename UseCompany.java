import java.io.*;
import java.util.*;

public class UseCompany
{
	public static void main(String []args)
	{
		Technician t1,t2,t3,t4;
		t1=new Technician("billy",123,4,"depart1");
		t2=new Technician();
		t3=new Technician("Jones",9362,2,"depart3");
		t4=new Technician("Marvis",45647,3,"depart4");
		SalesMan s1,s2,s3,s4;
		s1=new SalesMan("Ernie",45645,5642.00,"territory1");
		s2=new SalesMan("Brook",43497,3254.00,"territory2");
		s3=new SalesMan("Ernie",35978,7542.00,"territory3");
		s4=new SalesMan();
		Employee myCompany[]={t1,t2,t3,t4,s1,s2,s3,s4};
		Arrays.sort(myCompany);
		for(int i=0;i<myCompany.length;i++)
		System.out.println(myCompany[i]);
		System.out.println("Text testing\n");
		FileIO.writeAsText(myCompany,"");
		Employee emp[]=FileIO.loadArray("");
		for(int i=0;i<emp.length;i++)
		System.out.println(emp[i]);
		try
		{
			System.out.println("\n\nObject testing\n");
			FileIO.writeObject(myCompany,"E:\\Inherit&FileIO\\Employee1.txt");
			Employee emp2[]=FileIO.readObject("E:\\Inherit&FileIO\\Employee1.txt");
			for(int i=0;i<emp2.length;i++)
			System.out.println(emp2[i]);
		}
		catch(ClassNotFoundException cnfe)
		{
		   System.out.println("Class Not Found");
		}
	}
}


