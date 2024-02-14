import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //PSEUDO CODE HERE
        //class
        //  main
        //  return
        //end class
        //Declaring variables
        Scanner in = new Scanner(System.in);
        double tempC;
        double tempF;
        String doneYN = "";
        String trash = "";
        Boolean done = false;

        //do while loop to execute code so long as the boolean
        do{
            System.out.println("Enter the temperature in Celsius:");
            if(in.hasNextDouble())
            {
                tempC = in.nextDouble();
                in.nextLine();// Clearing buffer
                tempF = (tempC * 9/5) + 32;
                System.out.println("The temperature in Fahrenheit is " + tempF);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not" +trash);
            }
        } while (!done);
    }
}