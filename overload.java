//import java.util.*;
import java.util.Scanner;
class take
{
    void output()
    {
        System.out.println("Student details");
    }
    void output(String n)
    {
        System.out.println("Name:  "+n);
        System.out.println("No age and percentage are found");
    }
    void output(String n,int x)
    {
        System.out.println("Name:  "+n);
        System.out.println("Age:  "+x);
        System.out.println("No percentage is found");
    }
    void output(String n,int x,double k)
    {
        System.out.println("Name:  "+n);
        System.out.println("Age:  "+x);
        System.out.println("Percentage:  "+k);
        if(k<35)
        {
            System.out.println(n+"is failed");
        }
        else
        {
            System.out.println("Passed!!!..");
        }
    }
    void output(double k,String n,int x)
    {
        System.out.println("Name:  "+n);
        System.out.println("Age:  "+x);
        System.out.println("Percentage:  "+k);
        if(k<35)
        {
            System.out.println(n+" is failed");
        }
        else
        {
            System.out.println("Passed!!..");
        }
    
    }
}
class overload
{
    public static void main(String args[])
    {
        Scanner c = new Scanner(System.in);
        take a = new take();
        System.out.print("       ");
        a.output();
        System.out.println("**********************************");
        String name = c.next();
        int age=c.nextInt();
        double marks=c.nextDouble();
        a.output(name,age,marks);
        a.output(c.next(),c.nextInt());
        a.output("Monika");
        System.out.println();
        a.output("Inaya",16);
        System.out.println();
        a.output("Amrutha",20,82.6);
        System.out.println();
        a.output(34,"Harsha",19); 
        
    }
}
