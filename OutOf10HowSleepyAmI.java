import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class OutOf10HowSleepyAmI{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("\n How sleepy is Henry zzzzzzz");
        System.out.println("\n 1 being the most tired and 10 being the least");
        System.out.println("\n Put a number 1 between 10");
        int sleepyMeter = scan.nextInt();
       
        if (sleepyMeter <= 4) {
            System.out.println("Henry is super sleepy and should be going to sleep now");
        } else if (sleepyMeter <= 7) {
            System.out.println("Henry is sleepy and should being going to sleep soon or prepping");
        } else {
            System.out.println("Henry is not sleepy :) its either the energy drinks or he is really not sleepy ");
        }


    }
}