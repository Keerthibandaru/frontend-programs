/*program1
class Array
{
public static void main(String[] args)
{
int a[]=new int[3];
int sum=0;
a[0]=1;
a[1]=2;
a[2]=3;
sum=a[0]+a[1]+a[2];
System.out.println("the sum is:"+sum);
}
}
output:-the sum is:6*/

/*program2
class Array
{
public static void main(String[] args)
{

int a[]=new int[3];
int sum=0;
int length=a.length;
double avg;
a[0]=4;
a[1]=2;
a[2]=3;
sum=a[0]+a[1]+a[2];
avg=sum/length;
System.out.println("the avg is:"+avg);
}
}
output:-the avg is:3.0*/
/*program5
import java.util.Scanner;
class RemoveElement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0; i<n; i++) {
System.out.print("Enter value " + (i+1) + ": ");
arr[i] = sc.nextInt();
}
System.out.print("Enter value to remove: ");
int value = sc.nextInt();
int count = 0;
for(int i=0; i<n; i++) {
if(arr[i] != value) {
count++;
}
}
int newArr[] = new int[count];
int j = 0;
for(int i=0; i<n; i++) {
if(arr[i] != value) {
newArr[j] = arr[i];
j++;
}
}
System.out.print("Array after removing " + value + ": ");
for(int i=0; i<newArr.length; i++) {
System.out.print(newArr[i] + " ");
}
}
}
output:-Enter number of elements: 4
Enter value 1: 2
Enter value 2: 4
Enter value 3: 6
Enter value 4: 8
Enter value to remove: 4
Array after removing 4: 2 6 8
*/
/*program7
import java.util.Scanner;
class InsertElement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int arr[] = new int[n+1];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) {
arr[i] = sc.nextInt();
}
System.out.print("Enter position (0 to " + n + "): ");
int pos = sc.nextInt();
System.out.print("Enter value: ");
int val = sc.nextInt();
for(int i=n; i>pos; i--) {
arr[i] = arr[i-1];
}
arr[pos] = val;
System.out.print("Array after insertion: ");
for(int i=0; i<=n; i++) {
System.out.print(arr[i] + " ");
}
}
}
output:-Enter size: 4
Enter elements:
1
3
5
6
Enter position (0 to 4): 1
Enter value: 1
Array after insertion: 1 1 3 5 6*/
import java.util.Scanner;
class CommonValues {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size of first array: ");
int n = sc.nextInt();
int arr1[] = new int[n];
System.out.println("Enter elements of first array:");
for(int i=0; i<n; i++) {
arr1[i] = sc.nextInt();
}
System.out.print("Enter size of second array: ");
int m = sc.nextInt();
int[] arr2 = new int[m];
System.out.println("Enter elements of second array:");
for(int i=0; i<m; i++) {
arr2[i] = sc.nextInt();
}
System.out.print("Common values: ");
for(int i=0; i<n; i++) {
for(int j=0; j<m; j++) {
if(arr1[i]==arr2[j]) {
System.out.print(arr1[i] + " ");
break;
}
}
}
}
}
/*program
import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.print("Enter the values of an array:"); 
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Display the values of an array a:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Display the values of an array b:");
for(i=0;i<n;i++)
{
System.out.println(b[i]=a[i]);
}
s.close();
}
}
output:-Enter the size of an array:4
Enter the values of an array:1 2 3 4
Display the values of an array a:
1
2
3
4
Display the values of an array b:
1
2
3
4*/