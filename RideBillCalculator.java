import java.util.Scanner;
class RideBillCalculator
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter height");
int height=sc.nextInt();

if(height>120)
{
System.out.println("Can ride");
}
else
{
System.out.println("Can't ride");
}
System.out.println("enter age");
int age=sc.nextInt();
if(age<12)
{
System.out.println("$5");
}
else if(age>=12 && age<=18)
{
	System.out.println("$7");
}
else if(age>=18)
{
	System.out.println("$12");
}
else if(age>=45 && age<=55)
{
	System.out.println("$0");
}
System.out.println("want photos?");
String wantPhotos=sc.next();
	switch(wantPhotos)
	{
	case "Yes":
	System.out.println("+$3");
	break;
	
	case "No":
	System.out.println("the total bill is $x");
	break;
	
}
}
}

Output:

C:\Users\sarvesh.sonawane\Desktop\Calculator>javac RideBillCalculator.java

C:\Users\sarvesh.sonawane\Desktop\Calculator>java RideBillCalculator
enter height
121
Can ride
enter age
13
$7
want photos?
Yes
+$3
