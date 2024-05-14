import java.util.Scanner;
interface prop
{
    void get();
    void area();
    void perimeter();
}
class circle implements prop
{
    double pi=3.14;
    double r;
    Scanner sc=new Scanner(System.in);
    @Override
    public void get()
    {
        System.out.println("Enter the radius of the circle:");
        r = sc.nextDouble();
    }
    @Override
    public void area()
    {
        System.out.println("area of the circle: "+(pi*r*r));
    }
    @Override
    public void perimeter()
    {
        System.out.println("perimeter of the circle: "+(pi*r*2));
    }
}
class rectangle implements prop
{
    int l,b;
    Scanner sc=new Scanner(System.in);
    @Override
    public void get()
    {
        System.out.println("Enter the lenght of the rect:");
        l = sc.nextInt();
        System.out.println("Enter the bredt of the rect:");
        b = sc.nextInt();
    }
    @Override
    public void area()
    {
        System.out.println("area of the rectangle: "+(l*b));
    }
    @Override
    public void perimeter()
    {
        System.out.println("perimeter of the rect: "+((l+b)*2));
    }
}
public class Inter
{
    public static void main(String args[])
    {
    int ch;
    Scanner sc=new Scanner(System.in);
    circle obj1=new circle();
    rectangle obj2=new rectangle();
    do
    {
        System.out.println("Select am option \n1.cicle\n2.rect\n3.exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1 :obj1.get();
                    obj1.area();
                    obj1.perimeter();
                    break;
            case 2 :obj2.get();
                    obj2.area();
                    obj2.perimeter();
                    break;
            case 3 :System.exit(0);
        }
    }
    while(true);
}
}