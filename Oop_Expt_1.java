import java.util.Scanner;
class Complex{

    int img,real;
    
    public Complex()
    {
    }
    public Complex(int real , int img)
    {
        this.img = img;
        this.real  = real;

    }
    Complex add(Complex c1 ,Complex c2){

        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
    Complex Subtract(Complex c1, Complex c2){
        Complex temp = new Complex();
        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        return temp;
    }
    Complex multiply(Complex c1 , Complex c2){
        Complex temp = new Complex();
        temp.real = c1.real * c2.real;
        temp.img = c1.img * c2.img;
        return temp;
    }
    Complex Divide(Complex c1, Complex c2){
        Complex temp = new Complex();
        temp.real = c1.real / c2.real;
        temp.img = c1.img / c2.img;
        return temp;
    }

    void print()
    {
        System.out.println("Complex Number : " +real+ " + "+ img +"i");
    }

}

public class Oop_Expt_1 {
    public static void main(String[] args)
    { 
        System.out.println("Enter first complex no, real and then imaginary");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Complex c1 = new Complex(x,y);
        c1.print();
        System.out.println("Enter first complex no, real and then imaginary");
        int a= sc.nextInt();
        int b = sc.nextInt();
        Complex c2 = new Complex(a,b);
        c2.print();
        Complex c3 = new Complex();
      
        c3 = c3.add(c1, c2);
        System.out.println("SUM : ");
        c3.print();
       
        c3 = c3.Subtract(c1, c2);
        System.out.println("Difference is :");
        c3.print();
        
        c3 = c3.multiply(c1, c2);
        System.out.println("Multiplication : ");
        c3.print();

        c3 = c3.Divide(c1, c2);
        System.out.println("Divide : ");
        c3.print();
        
        sc.close();
    }
    
}
