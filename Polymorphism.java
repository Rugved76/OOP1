import java.util.Scanner;

class Publication
{
    public String Title;
    public int price;
    public int copies;     //number of copies sold

    public Publication()
    {
        //default
    }

    public Publication(String Title , int price , int copies)
    {
        this.Title= Title;
        this.price= price;
        this.copies= copies;
    }

    void salecopy()
    {
        System.out.println("Title : "+Title);
        System.out.println("Copies  : "+copies+ "\nTotal Cost : "+price*copies+" Rs");
        System.out.println("---------------------------");
    }

}

class Book extends Publication
{
    String author;

    void ordercopies()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Title, author name and price :");
        Title = sc.nextLine();
        author = sc.nextLine();
        price = sc.nextInt();

        System.out.println("Enter number of copies :");
        copies = sc.nextInt();
    }

}

class Magazine extends Publication
{
    int issue_no,ordered_issue;

    Scanner mag = new Scanner(System.in);

    void orderqty()
    {
        System.out.println("Enter Title, price and number of copies : ");
        Title = mag.nextLine();
        price = mag.nextInt();
        copies = mag.nextInt();
    }

    void curr_issue()
    {
        System.out.println("Enter current issue number :");
        issue_no = mag.nextInt();
    }

    void receive_issue()
    {
        System.out.println("Enter ordered issue number :");
        ordered_issue = mag.nextInt();
        System.out.println("the current issue is : "+ issue_no+ "\nOrdered issue is : " +ordered_issue);
    }
    
}

public class Polymorphism
{
    public static void main(String[] args) 
    {
        Book b = new Book();
        Magazine m = new Magazine();
        Scanner sc = new Scanner(System.in);
        int flag=1;
        
        while (flag==1) 
        {
            System.out.println("Enter\n1 for Books\n2 for magazine\n3 to Exit\n");
            int key = sc.nextInt();
            switch (key) 
            {
                case 1:
                b.ordercopies();
                b.salecopy();
                break;
                
                case 2:
                m.orderqty();
                m.curr_issue();
                m.receive_issue();
                m.salecopy();
                break;

                case 3:
                flag=2;
                break;

            }

        }
      
    }

}