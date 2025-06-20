/*program1
class Basics
{
	public void sign()
	{
	   System.out.println("keerthi");
	}
	public static void main(String[] args)
	{
	    Basics b=new Basics();
                    b.sign();
	}
}
output:-keerthi*/

/*program2
public class Basics
 {
    public static void main(String[] args)
          {
              System.out.println("hello");
           }
 }
output:-hello*/

/*program3
class Basics
{
	/**void sign()
	{
	   System.out.println("hello");
	}*/
	/*public static void main(String[] args)
	{
	   /* Basics b=new Basics();
                    b.sign();*/
	 //System.out.println("hi");
                    /*System.out.println("ECE");
	}
}
output:-ECE */
/*program4
class Basics1
{
    public static void main(String[] args)
    {
        int a=24;
        boolean b=true;
        char c='A';
        float d= 3.14f;   
        double e= 99.99;
        
        System.out.println("Integer value: "+a);
        System.out.println("Boolean value: "+b);
        System.out.println("Character value: "+c);
        System.out.println("Float value: " +d);
        System.out.println("Double value: " +e);
    }
}
output:-Integer value: 24
Boolean value: true
Character value: A
Float value: 3.14
Double value: 99.99
*/
public class Basics2
{
    int x = 10;
     public void local() {
        int x = 20;

        System.out.println("Local variable : " + x);   
        
    }
    public static void main(String[] args) 
    {
        Basics2 b = new Basics2();
        b.local();
        
        System.out.println("Global Variable: "+b.x);
    }
}
/*class Basics3
{
    public void name()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) 
    {
        Basics b=new Basics();
        b.name();
    }
}*/
