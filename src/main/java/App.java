/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String key = sc.nextLine();
        if (key.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String cor = sc.nextLine();
            if (cor.equals("y"))
            {
                System.out.println("Clean terminals and try starting again. ");
            }
            else
            {
                System.out.println("Replace cables and try again. ");
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            String noise = sc.nextLine();
            if (noise.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                String crank = sc.nextLine();
                if (crank.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    String engine = sc.nextLine();
                    if(engine.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection ");
                        String fuel = sc.nextLine();
                        if (fuel.equals("y"))
                        {
                            System.out.println("Get it in for service. ");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
