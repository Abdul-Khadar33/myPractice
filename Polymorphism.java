/* Polymorphism means many forms or many behaviours....Its look like a human role or functions or piluchukodam
changes based on the different place...
It is 2 types. Compile time and run time polymorphisms...
Compile time means it behaviors will decide at compile time( Overloading )
  Overloading means same method with different parameters
  add(int n1, int n2) and add(int n1, int n2, int n3) -- depends on parameters in compile time....
Run time means its behavior decide on run time only(Overriding)
  Overriding means it will override method or values based on suggestions or priorities
  add(int n1, int n2)sout("parent method executes"))
  add(int n1, int n2)sout("child method executes"))
  In above, 2 methods are same... child method have add method. so it executes.... if dont, parent method will execute 
   */

   //Dynamic method dispatch(  Run time polymorphism -- it means overriding may happen)(Only works when inherits or extends)

class Abc
{
    public void shows()
    {
        System.out.println("It is A show");
    }
}
class Bcd extends Abc 
{
    public void shows()
    {
        System.out.println("It is B show");
    }
}
class Cde extends Abc 
{
    public void shows()
    {
        System.out.println("It is C show");
    }
}
public class Polymorphism
{
    public static void main(String args[])
    {
        Abc obj = new Abc();
        obj.shows();
        
        obj = new Bcd();
        obj.shows();

        obj = new Cde();
        obj.shows();
    }
}

