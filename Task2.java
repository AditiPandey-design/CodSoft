import java.util.Scanner;

public class Task2 
{
    void calGrade()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int sub = sc.nextInt();
        int total=0;
        for(int i=1;i<=sub;i++)
        {
            System.out.println("Enter the marks obtained in subject "+i+"( out of 100): ");
            int marks = sc.nextInt();
            total=total+marks;
        }
        double av =(double)total/sub;
        String gr=" ";
        sc.close();
        if(av>=100||av<0)
        {
            System.out.println("Invalid Input");
        }
        else if(av>90&&av<100)
        {
            gr="A+";
        }
        else if(av>75&&av<=90)
        {
            gr="A";
        }
        else if(av>60&&av<=75)
        {
            gr="B";
        }
        else if(av>45&&av<=60)
        {
            gr="C";
        }
        else if(av>33&&av<=45)
        {
            gr="D";
        }
        else 
        {
            gr="F";
        }
        System.out.println("\n.....RESULT.....");
        System.out.println("Total Marks: "+total);
        System.out.println("Average Percentage: "+av+"%");
        System.out.println("Grade: "+gr);
    }
    public static void main(String args[])
    {
        Task2 obj=new Task2();
        obj.calGrade();
    }
    
}

