import java.util.Scanner;
class Loop1{
public static void main(String args[])
{/*
for(int i=0;i<10;i++)
{
System.out.println("Bright It Career");
}
}
}
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career

*//*program 2
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20*/
/*program3
int a=10;
int b=10;
int c=5;
if(a==b)
{
System.out.println("a is equal to b");
}
if(b==c)
{
System.out.println("b is equal to c");
}
}
}
a is equal to b
*//*program4
int limit=20;
System.out.println("odd Numbers up to"+limit +":");
for(int i=1;i<=limit;i++)
{
if(i%2!=0)
{
System.out.println(i+" ");
}
}
System.out.println("\n even Numbers up to " +limit + ":");
for(int i=1;i<=limit;i++)
{
if(i%2==0)
{
System.out.println(i+" ");
}
}
}
}
odd Numbers up to20:
1
3
5
7
9
11
13
15
17
19

 even Numbers up to 20:
2
4
6
8
10
12
14
16
18
20*/
/*program5
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=scanner.nextInt();
System.out.println("Enter the second number:");
int num2=scanner.nextInt();
System.out.println("Enter the third number:");
int num3=scanner.nextInt();
int largest;
if(num1>=num2&&num1>=num3)
{
largest=num1;
}
else if(num2>=num1&&num2>=num3)
{
largest=num2;
}else{
largest=num3;
}
System.out.println("the largest number is:"+ largest);
}
}
output:Enter the first number:
2
Enter the second number:
23
Enter the third number:
21
the largest number is:23*/
/*program6
int n=10;
System.out.println("Even numbers between 1 and 100:");
while(n<=100)
{
if(n%2==0)
{
System.out.println(n);
}
n++;
}
}
}
output:
Even numbers between 1 and 100:
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100*/
/*
program7
int i=1;
do
{
System.out.println(i);
i++;
}
while(i<=10);
}
}
output:1
2
3
4
5
6
7
8
9
10*/
/*program8
int n,i,rem,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
n=s.nextInt();
i=n;
while(n>0)
{
rem=n%10;
sum+=rem*rem*rem;
n/=10;
}
if(i==sum)
{
System.out.println(i+"is an Armstrong number");
}
else{
System.out.println(i+"is not an  Armstrong number");
}
}
}
output:
Enter a number:
371
371is an Armstrong number
*/
/*program12
Scanner scanner=new Scanner(System.in);
System.out.println("enter gender(M/F):");
char genderChar=scanner.next().charAt(0);
switch(genderChar)
{
case'M':
case'm':
System.out.println("Male");
break;
case'F':
case'f':
System.out.println("Female");
break;
default:
System.out.println("invalid input.please  enter M or F:");
break;
}
}
}
OUTPUT:enter gender(M/F):
F
Female
*/
/*program13
int n1=10;
int n2=20;
int n3=30;
int largest;
if(n1>=n2&&n1>=n3)
{
largest=n1;
}
else if(n2>=n1&&n2>=n3)
{
largest=n2;
}
else
{
largest=n3;
}
System.out.println("the largest number is:"+largest);
}
}
output:the largest number is:23*/
/*program11
Scanner s=new Scanner(System.in);
System.out.println("Enter an integer:");
int number=s.nextInt();
int remainder=number %2;
switch(remainder)
{
case 0:
System.out.println(number+"is an even number");
break;
case-1:
System.out.println(number+"is an odd number");
break;
default:
System.out.println("invalid input or unexpected remainder:");
}
}
}
output:Enter an integer:
12
12is an even number*/
/*program9
int num=97;
System.out.println( "the given  number is:"+num);
int count=0;
if(num==2)
{
System.out.println( num+"is a prime number");
}
else
{
for(int i=1;i<=num;i++)
{
if(num%i==0){
count++;
}
}
if(count==2)
{
System.out.println( num+"is a prime number");
}
else{
System.out.println( num+"is  not a prime number");}
}
}
}
output:the given  number is:97
97is a prime number











