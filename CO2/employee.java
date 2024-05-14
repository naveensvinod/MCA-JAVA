import java.util.Scanner;
class employee
{
int eno;
String ename;
int esalary;
employee(int e,String nam,int sal)
{
eno=e;
ename=nam;
esalary=sal;
}

			

void display()
{
System.out.println("eno:"+eno);
System.out.println("ename:"+ename);
System.out.println("esalary:"+esalary+"\n"); 
}

public static void main(String[] args)
{
int i,n,key,flag=0,pos=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of employees");
n=sc.nextInt();
employee obj[]=new employee[n];
System.out.println("enter the details of employees"+"\n");
for(i=0;i<n;i++)
{
System.out.println("enter the no:");
            int e=sc.nextInt();
			System.out.println("enter ename:");
            String nam=sc.next();
			System.out.println("enter the salary:");
            int sal=sc.nextInt();
	obj[i]=new employee(e,nam,sal);
	}
System.out.println(" the details of employees are");
for(i=0;i<n;i++)
{
obj[i].display();
}
System.out.println(" enter the employee's no to be search:");
key=sc.nextInt();
for(i=0;i<n;i++)
{
if(key==obj[i].eno)
{
	System.out.println(" eelement found"+pos+"positon");
	//obj[i].display();
	flag++;
}
else
{
	pos++;
}
}
if(flag==0)
{
	System.out.println("Employee not found");
}
}
}

	

	



