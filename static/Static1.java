
/*program1
class Methods
{
static int a=10;
static int b=20;
 int c=30;
int d=40;
static 
{
System.out.println("static");
}static
{
System.out.println("static method");}
{
System.out.println("instance");}
{
System.out.println("instance method");}
static void add(){
int a=20;
System.out.println(a+b);}
static void sub(){
int b=30;
System.out.println(a-b);}
 void mul(){
int c=40;
System.out.println(c*d);}
void div(){
int d=50;
System.out.println(c/d);}
public static void main(String args[]){
Methods m=new Methods();
m.add();
m.sub();
m.mul();
m.div();
}
}
output=static
static method
instance
instance method
40
-20
1600
0*/
/*program2
class Instancevariable
{
    int a=10;
    int b=20;
    static void a()
    {
        Instancevariable obj=new Instancevariable();
        System.out.println(obj.a);
        System.out.println(obj.b);
        
    }
    public static void main(String[] args)
    {
        System.out.println("executed succesfully");
        a();
    }
}
output:-executed succesfully
20*/
/*program3
public class Instancevar
{
    static int a=10;
    static int b=20;
    void b()
    {
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void main(String[] args)
    {
        System.out.println("hello");
        Instancevar obj=new Instancevar();
        obj.b();
        
    }
}
output:-hello
10
20*/
/*program4
class Static 
{
    void show() 
    {
        System.out.println("This is instance method");
    }

    
    public static void  main(String[] args) 
    
    {
        System.out.println("successful");
        Static obj = new Static();
        obj.show();  
    }
}
output:-successful
This is instance method*/
/*program5
class  Instance
{
static void show()
{
System.out.println("This is static method");
}
public void display()
{
System.out.println("inside instance method");
show();
}
public static void  main(String[] args) {
Instance obj = new Instance();
        obj.display();  
    }
}
output:-inside instance method
This is static method*/
 /*program6
class Static1
{    
    static int a = 10;
    static int b = 20;
    int c = 30;
    int d = 40;

    public static void main(String[] args) {
        System.out.println("Static Variables:");
        System.out.println( a);
        System.out.println(b);

        Static1 s = new Static1();

        System.out.println("Instance Variables:");
        System.out.println(s.c );
        System.out.println(s.d);
    }
}
output:-Static Variables:
10
20
Instance Variables:
30
40*/
class Static2
{
    static void a()
    {
        System.out.println("Welcome");
    }
    void ins()
    {
        System.out.println("Back to home");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method");
        a();
        Static2 s=new Static2();
        s.ins();
    }
}

