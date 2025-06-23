/*program1
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="keerthi";
String s2=new String("keerthi");
System.out.println(s1);
System.out.println(s2);
}
}
output:-keerthi
keerthi*/
/*program2
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Hello";
String s2="Pavani";
System.out.println(s1+s2);
}
}
output:-HelloPavani
*/
/*program3
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Hello";
System.out.println(s1.length());
}
}
output:-5*/
/*program4
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Hello";
System.out.println(s1.substring(3));
}
}
output:-lo*/
/*program5
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Hello";
System.out.println(s1.indexOf('e'));
}
}
output:-1*/
/*program6
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Hello";
String s2="Hello";
System.out.println(s1.matches(s2));
}
}
output:-true*/
/*program7
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Hello";
String s2="Hello";
System.out.println(s1.equals(s2));
}
}
output:-true*/
/*program8
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Hello hi";
String s2="Hello hi";
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.startsWith("Hello"));
System.out.println(s1.endsWith("hi"));
System.out.println(s1.compareTo(s2));
}
}
output:-true
true
true
0*/
/*program9
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="  Hello";
System.out.println(s1.trim());
}
}
output:-Hello*/
/*program10
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Hello";
String s2="Hi";
System.out.println(s1.replace('e','i'));
}
}
output:-Hillo*/
/*program11
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Pavani kavitha komali";
String[] words=s1.split(" ");
for(String word:words)
{
System.out.println(word);
}
}
}
output:-Pavani
kavitha
komali*/
/*program12
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1=String.valueOf(5);
System.out.println(s1+10);
}
} 
output:-510*/
/*program13
import java.lang.String;
class Strings{
public static void main(String args[])
{
int n=24;
String s1=Integer.toString(n);
System.out.println(s1);
}
}
output:-24*/
/*program14
import java.lang.String;
class Strings{
public static void main(String args[])
{
String s1="Pavani";
String s2="Megh";
System.out.println(s1.toUpperCase());
System.out.println(s2.toLowerCase());
}
}
output:-PAVANI
megh*/