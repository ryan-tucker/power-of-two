import java.util.Scanner;
public class PowerOfTwo
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter a number to be checked.");

        int num = key.nextInt();
        
        while (num > 1)
        {
            num = num / 2;

            if (num == 2)
            {
                System.out.println("Your number is a power of two!");
                key.close();
                System.exit(0);
            }
        }
        
        key.close();
        System.out.println("oof! Your number isn't a power of two!");
        System.exit(0);


    }
}
