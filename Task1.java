import java.util.Scanner;
import java.util.Random;
class Task1
{
    void GuessTheNumber()
    {
        Scanner ip=new Scanner(System.in);
        Random r=new Random();
        boolean playAgain=true;
        while(playAgain)
        {
            int a =r.nextInt(100)+1;        //random number
            int b=0;       //Number of Attempts
            boolean c=false;
            while(c==false)
            {
                System.out.println("Enter the guessed number: ");
                int g=ip.nextInt();     //guessed number
                b++;
                if(g==a)
                {
                    System.out.println("Congratulations! You guessed the right number.");
                    c=true;
                }
                else if(g>a)
                {
                    System.out.println("It's too High! Please try again.");
                }
                else
                {
                    System.out.println("It's too Low! Please try again."); 
                }
            }
            int score=scoreCalc(b);
            System.out.println("You Guessed the correct number in "+b+" attempts.");
            System.out.println("Your score : "+score);
            System.out.println("Would you like to play again(yes/no): ");
            String x=ip.next();
            if(x.equalsIgnoreCase("yes"))
            {
                playAgain=true;
            }
            else
            {
                playAgain=false;
                System.out.println("Thanks for Playing");
            }
        }
        ip.close();
    }

    int scoreCalc(int b)
    {
        if(b<=2)
        {
            return 100;
        }
        else if(b<=4)
        {
            return 80;
        }
        else if( b<=6)
        {
            return 50;
        }
        else 
        {
            return 30;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Number Game!");
        System.out.println("Guess number between 1 to 100 ?");
        Task1 obj=new Task1();
        obj.GuessTheNumber();
    
    }
}