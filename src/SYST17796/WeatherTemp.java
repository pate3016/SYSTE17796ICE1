/*
 * Name: Patel Ruchikaben Kanubhai
 * Student ID: 991621908
 * Exercise: 1
 * Description: calculates the average of the weather temps.
 */
package SYST17796;

import java.util.Scanner;

/**
 *
 * @author Damini
 */
public class WeatherTemp {

    public static void calcAvg(int[] temps) {
        // Calculate and print the average        
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }

        // need a cast to avoid integer division
        double average = (double) sum / temps.length;
        System.out.println("Average Temperature = " + average);
    }
    public static void maxTemp(int[] temps) {
        //calculate highest temperature
        double maxTemp = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > maxTemp) {
                maxTemp = temps[i];
            }
        }
        System.out.println("Maximum Temperature = " + maxTemp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of days from the user.
        System.out.print("How many days' temperatures? ");
        int days = input.nextInt();

        // Declare and create an array, maybe should check if days is positive
        int[] temps = new int[days];

        // Input and store the temperatures in the array
        for (int i = 1; i <= temps.length; i++) {
            System.out.print("Day " + i + "'s temperature: ");
            temps[i] = input.nextInt();
        }
        calcAvg(temps);
        maxTemp(temps);
    }
}
