import java.util.Scanner;

abstract class Shape
{
    double length,breadth,side;
    Scanner p = new Scanner(System.in);

    public Shape()
    {
        length =0;
        breadth=0;
        side=0;
    }
    public Shape(double length,double breadth , double side)
    {
        this.length= length;
        this.breadth= breadth;
        this.side= side;
    }
    public void getrectangle()
    {
        System.out.println("Enter length and breadth: ");
        length = p.nextDouble();
        breadth = p.nextDouble();
        
    }
    public void gettriangle()
    {
        System.out.println("Enter side of traingle:  ");
        side = p.nextDouble();
    }
    abstract public void compute_area();
}

class triangle extends Shape
{
    double area1;
    public void compute_area()
    {
        area1 = (side*side*1.73)/4;
        System.out.println("Area of triangle is : "+String.format("%.2f",area1)+" sq units");

    }
}
class rectangle extends Shape
{
    double area2;
    public void compute_area()
    {
        area2 = length * breadth;
        System.out.println("Area of rectangle is : "+String.format("%.2f",area2)+" sq units");
    }
}
public class Dynamic_Binding
{
    public static void main(String[] args) 
    {
        
        Shape t = new triangle();
        Shape r = new rectangle();
        Scanner s  = new Scanner(System.in);
        int key;
        int flag=1;
        while (flag==1) 
        {
            System.out.println("---------------------------\n");

            System.out.println("Press\n1 for triangle\n2 for rectangle\n3 to exit\n");

            key = s.nextInt();
            System.out.println("---------------------------\n");

            switch (key) 
            {
                case 1:
                t.gettriangle();
                t.compute_area();
                break;
            
                case 2:
                r.getrectangle();
                r.compute_area();
                break;

                case 3:
                flag=2;
                System.out.println("Exit! \n");
                break;
            }

        }
        s.close();
    }

}

