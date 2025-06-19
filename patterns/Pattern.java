class Pattern{
public static void main(String args[])
{    
/*pattern1
int i,j;
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}
*/
/*pattern2
int i,j;
for(i=1;i<6;i++)
{
for(j=0;j<5;j++)
{
System.out.print(i+" ");
}
System.out.println(" ");
}
}
}*/
/*pattern3
int i,j;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(j+" ");
}
System.out.println(" ");
}
}
}*/
/*pattern4
int i,j;
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
}
System.out.println(" ");
}
}
}*/
/*program5
int i,j;
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
if(n>9)
{
n=1;
}
}
System.out.println("  ");
}
}
} output:
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7*/
/*program6
int i,j;
int n=1;
for(i=1;i<5;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n--;
if(n!=0)
{
n=1;
}
}
System.out.println(" ");
}
}
}*/
/*pattern7
int i,j;
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n=n+2;
}
System.out.println(" ");
}
}
}*/
/*program8
for(int i=0;i<=5;i++)
{
for(int j=0;j<=5;j++){
if(j<6-i)
{
System.out.print(" ");}
else{
System.out.print("* ");
}
}
System.out.println(" ");
}
}
}
output:    
    *
    * *
   * * *
  * * * *
 * * * * *
*/
/*program9
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5-i;j++){
System.out.print(" ");}
for(int k=1;k<=i;k++)
{

System.out.print((2*k)+ " ");
}
System.out.println( );}
}
}
output:
   2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10
*/

/* pattern10
String word="INDIA";
for(int i=1;i<=word.length();i++)
{
System.out.println(word.substring(0,i));
}
}
}
output:
I
IN
IND
INDI
INDIA*/
/*program11
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print(" ");}
for(int k=1;k<=(2*i-1);k++)
System.out.print("*");
System.out.println( );}
}
}
output:
      *
    ***
   *****
  *******
 *********   */
/*program12
int n=4;
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print(" ");}
for(int j=1;j<=(2*i-1);j++){
System.out.print("* ");}
System.out.println( );
}
for(int i=n-1;i>=1;i--)
{
for(int j=n;j>i;j--)
{
System.out.print(" ");}
for(int j=1;j<=(2*i-1);j++){
System.out.print("* ");}
System.out.println( );
}
}
}
output:
     *
   ***
  *****
 *******
   *****
     ***
       *
*/
/*pattern13
int n=4;
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
System.out.print(" ");
System.out.print("*");
if(i!=0)
{
for(int j=0;j<2*i-1;j++)
System.out.print(" ");
System.out.print("*");
}
System.out.println( );}
for(int i=n-2;i>=0;i--)
{
for(int j=0;j<n-i-1;j++)
System.out.print(" ");
System.out.print("*");
if(i!=0){
for(int j=0;j<2*i-1;j++)
System.out.print(" ");
System.out.print("*");
}
System.out.println( );
}
}
}
output:
   *
  * *
 *   *
*      *
 *   *
  * *
   *
*/
/*program14
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++){
if(i==1||i==n||j==1||j==n)
System.out.print("* ");
else
System.out.print(" ");}
System.out.println( );}
}
}
output:
* * * * *
*           *
*           *
*           *
* * * * *
*/
/*program15
int n=7;
int m=n/2;
for(int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++){
if(i==m||j==m){
System.out.print("*");}
else{
System.out.print(" ");}
}
System.out.println( );}
}
}
output:
       *
       *
       *
********
       *
       *
       *
       *
*/
/*program16
int n=7;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==i||j==n-i+1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println( );
}
}
}
ouput:
*     *
 *   *
  * *
   *
  * *
 *   *
*     *
*/
/*pattern17
   int n=7;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||i==n||i==(n+1)/2||j==1||j==n||j==(n+1)/2)
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println( );
}
}
}
output:
* * * * * * *
*       *         *
*       *         *
* * * * * * *
*        *        *
*        *        *
* * * * * * *
*/
/*pattern18
int n=7;
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
if(j==1||j==i||i==n){
System.out.print("* ");}
else{
System.out.print(" ");}
}
System.out.println( );
}
}
}
output:
* * * * * * *
*     *
*    *
*   *
*  *
* *
*
*/
/*pattern19
int i,j;
int n=1;
for(i=0;i<6;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println(i);
}
}
}*/
/*program20
int n=7;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(i==1){
System.out.print("* ");
}
else if(j==1||j==i){
System.out.print("*");
}
else{
System.out.print( " ");
}
}
System.out.println( );}
}
}
output:
* * * * * * *
**
* *
*  *
*   *
*    *
*     *
*/
