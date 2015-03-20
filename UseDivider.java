public class UseDivider
{   
    //this tests the methods of Divider class. 
    


    public static void main(String[] args)
    {
      Divider Final = new Divider(10, -10, 15000, 5000);
       String test;
    
      System.out.print("enter test name(x=exit): ");
      test = IO.readString();
     
      while(!test.equals("x"))
      {
        System.out.println("-----------------");
        System.out.print("enter top voltage: ");
        Final.setVTOP(IO.readDouble());
        System.out.print("enter bottom voltage: ");
        Final.setVBOTTOM(IO.readDouble());
        System.out.print("enter top resistor: ");
        Final.setrTOP(IO.readDouble());
        System.out.print("enter bottom resistor: ");
        Final.setrBOTTOM(IO.readDouble());
        System.out.print("enter test name(x=exit): ");
        Final.calculate();
        Final.display();
        test = IO.readString();
      } 
         
    }



}     