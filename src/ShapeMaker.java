import java.util.Scanner;

public class ShapeMaker {
    public static void main(String[] args) {
        // 1. DECLARE VARIABLES
        String ch = "";
        int height = 0;
        int width = 0;
        int option = 1;
        int heightTriangle = 1;
        Scanner scanner = new Scanner(System.in);


        System.out.println("************************************");
        System.out.println("***** SHAPE MAKER PROGRAM **********");
        System.out.println("************************************");

        // 3. LOOP WHILE OPTION IS NOT 0
        while (option != 0) {
            System.out.println("Menu");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("0. EXIT");

            // GET MENU OPTION FROM USER
            System.out.print("Enter your option 0|1|2 ==> ");
            option = scanner.nextInt();

            // USE SWITCH/CASE to get INPUTS and call METHODS
            switch (option) {
                case 0:
                    // exit
                    break;
                case 1:
                    System.out.print("Input the height ==> ");
                    height = scanner.nextInt();
                    System.out.print("Input the width ==> ");
                    width = scanner.nextInt();
                    System.out.print("Input the character for shape ==> ");
                    ch = scanner.next();
                    drawRectangle(width, height, ch);
                    break;
                case 2:
                    System.out.print("the height of triangle that you want ==> ");
                    heightTriangle = scanner.nextInt();
                    System.out.print("Input the character for shape ==> ");
                    ch = scanner.next();
                    drawTriangle(heightTriangle, ch);
                    break;
                default:
                    break;

            } // end switch/case
        }
    }
    static void drawRectangle(int width, int height, String ch)
    {
        for (int i = 1; i <= height; i++)
        {
            for (int k = 1; k <= width; k++)
            {
                if (i == 1 || i == height )
                {
                    System.out.print(ch + " ");

                }
                else
                {
                    if (k == 1)
                    {
                        System.out.print(ch);
                    }
                    else if (k == width)
                    {
                        System.out.print(" " + ch);
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }

    static void drawTriangle(int heightTriangle, String ch)
    {
        for (int i = 1; i <= heightTriangle; i++)
        {
            for (int j = 1; j <= heightTriangle - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
