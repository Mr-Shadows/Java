import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        readAndPrintOddNumbers();
    }

    public static void readAndPrintOddNumbers()
    {
        Scanner scanner = new Scanner(System.in);

        int number;
        do
        {
            number = scanner.nextInt();
            if (number % 2 != 0) {
                System.out.println(number);
            }
        } while (number != 0);

        scanner.close();
    }
}
