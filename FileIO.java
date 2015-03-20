
import java.io.*;
import java.util.*;

public class FileIO
{
	//Function which writes to file as text,deals with all the errors
   public static void writeAsText(Employee emply[], String fname)
	{
	//Trying to write to file throwing exception
	   try
		{	
			BufferedWriter writer = new BufferedWriter(new PrintWriter(new File(fname)));
			int i = 0;
			for(i = 0; i < emply.length; i = i + 1)
			{
				writer.write(emply[i].toString());
				writer.newLine();						
			}
			writer.close();			}
		//If file is not found do this
		catch(FileNotFoundException ferror)
		{
		   System.out.println("File Not Found");
			return ;
	   }
		//If there is a read write error do this
		catch(IOException r_werror)
		{
		   System.out.println("Writing Error");	   
		}
	}
	/**This function reads text from file and creates an array of Employee
	from data written and returns, it deals with all the error
	*/
	public static Employee[] loadArray(String fname1)
	{
		BufferedReader reader = null;
		try 
		{    
		    reader = new BufferedReader(new FileReader(fname1));
	   }
		catch(FileNotFoundException ferror1)
		{
		    System.out.println("The File was not found");
			 return null;
		}
		StringTokenizer token;
		ArrayList<Employee> employl = new ArrayList<Employee>();
		String line, tname, tlocation, ttype;
		int tnum, tlev;
		double tsale;
		try
		{  
			while((line=reader.readLine()) != null)
		   {        			 		  
				token = new StringTokenizer(line,",");
			   ttype = token.nextToken();
				if(ttype.compareToIgnoreCase("t")==0)
				{  						    
					tname = token.nextToken();
					tnum = Integer.parseInt(token.nextToken());
					tlev = Integer.parseInt(token.nextToken());
					tlocation = token.nextToken();
					employl.add(new Technician(tname, tnum, tlev, tlocation));
				}	 
				if(ttype.compareToIgnoreCase("s")==0)
				{     
					tname = token.nextToken();
					tnum = Integer.parseInt(token.nextToken());
					tsale = Double.parseDouble(token.nextToken());
					tlocation = token.nextToken();
               employl.add(new SalesMan(tname, tnum, tsale, tlocation));																   
				}
			}
		}
		catch(IOException io)
		{
		    System.out.println("Reading Error");
		}
		Employee emplye[] =new Employee[employl.size()];
		int i = 0;
		for(i = 0; i < employl.size(); i = i + 1)
		{
		 	 Employee emplye1 = employl.get(i);
		 	 emplye[i] = emplye1;
		}
		return emplye;
	}
	//This functions writes the Objects to file as it is
	public static void writeObject(Employee emply[],String fname) throws ClassNotFoundException
	{
	   try		 
		{  
			File employf = new File(fname);  
			BufferedOutputStream myBuffer = new BufferedOutputStream(new FileOutputStream(employf)); 
		   ObjectOutputStream employOF = new ObjectOutputStream(myBuffer); 
			int i = 0;
			for(i = 0; i < emply.length; i = i + 1)
			{
				employOF.writeObject(emply[i]);
				employOF.flush();
			}
			employOF.close(); 
		 }
		 catch(FileNotFoundException ferror3)
		 {
		 	System.out.println("The File was not found");
		 }
		 catch(IOException r_werror1)
		 {
		 	System.out.println("Writing Error Object");	   
		 }
	}
	//This functions writes the Objects to file as it is
	public static Employee[] readObject(String fname)
   {
	    ArrayList <Employee> employl = null;    
		 try
		 {	    
		    File employF = new File(fname);
			 ObjectInputStream read_employeefile = new ObjectInputStream(new BufferedInputStream(new FileInputStream(employF)));
			 employl = new ArrayList<Employee>();
			 for(;;)
			 {
			 	employl.add((Employee)read_employeefile.readObject());
			 }
		 }
		 catch(FileNotFoundException fileerror)
		 {
		    System.out.println("The File was not found");
			 return null;
		 }
		 catch (EOFException EOFE){}
		 catch(IOException IOE)
		 {
		   System.out.println("Reading Error Object");	   
		 }
		 catch(Exception eof){}
		 Employee employees[] = new Employee[employl.size()];
		 int i = 0;
		 for(i = 0; i < employl.size(); i = i + 1)
		 {
		 	employees[i]=employl.get(i);
		 }
       return employees;
	}
}

