class Hello
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
static void add()
{
int a=20;
System.out.println(a+b);}
static void sub()
{
int b=30;
System.out.println(a-b);}
 void mul(){
int c=40;
System.out.println(c*d);}
void div(){
int d=50;
System.out.println(c/d);}
}
class Memory
{
static int w=10;
static int x=20;
 int y=30;
int z=40;
static{
System.out.println("static");}
static{
System.out.println("static method");}
{
System.out.println("instance");}
{
System.out.println("instance method");}
static void a()
{
int w=20;
System.out.println(w+x);}
static void s()
{
int x=30;
System.out.println(w-x);}
 void m(){
int y=40;
System.out.println(y*z);}
void d(){
int z=50;
System.out.println(y/z);}
public static void main(String args[]){
Hello h=new Hello();
h.add();
h.sub();
h.mul();
h.div();
Memory m=new Memory();
m.a();
m.s();
m.m();
m.d();
}
}
















