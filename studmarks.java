import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;
class details
{
    int rno,sum;
    String name;
    float avg;
    int marks[]=new int[5];
    void read()
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter name of the student:");
        name=in.next();
        System.out.print("Enter roll no.of the student:");
        rno=in.nextInt();
        System.out.print("Enter marks of subjects:");
        for(int i=0;i<5;i++)
        {
            marks[i]=in.nextInt();
        }


    }
    void display()
    {
        System.out.println("Roll no: "+rno);
        System.out.println("Name: "+name);
        System.out.println("Marks of subjects:");
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Average marks of the student:"+avg);
    }
    /*void average()
    {
        sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=marks[i];
        }
        avg=(float)sum/5;
    }*/
    void passfail()
    {
        int count=0,a=0;
        for(int i=0;i<5;i++)
        {
            if(marks[i]<=35)
            {
                count++;
            }
            else
            {
                a++;
            }
        }
            System.out.println(count+"subjects failed!!..");
            System.out.println(a+"Subjects passed");
        
        
    }
}

public class studmarks {
    public static void main(String args[])
    {
        int n,i;
        Scanner ou =new Scanner(System.in);
        System.out.print("Enter no.of students: ");
        n=ou.nextInt();
        details stud[]=new details[n];
        for(i=0;i<n;i++)
        {
            stud[i]=new details();
            stud[i].read();
            stud[i].display();
            //stud[i].average();
            stud[i].passfail();

        }
    } 
    
}
