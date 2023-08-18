import jdk.jfr.Description;

import javax.naming.Name;
import javax.naming.StringRefAddr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException{

            Thread.sleep(500);
            System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

            ArrayList<String> rockList= new ArrayList<String>();

            rockList.add("basalt");
            rockList.add("jasper");
            rockList.add("agate");
            rockList.add("not rock");

            System.out.println("Everything has been downloaded");
            System.out.println(rockList);

            System.out.println("There appears to be a non-rock in the list. It needs to be removed");

            rockList.remove("not rock");
            System.out.println(rockList);
            System.out.println("Now our list is perfect!");

            //loading time
            Thread.sleep(1000);

            HashMap<String, String> fossilDirectory = new HashMap<>();

            System.out.println("Fossil data downloaded");

            fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
            fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
            fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

            System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

            Scanner input = new Scanner(System.in);
            String fossilChoice = input.nextLine();

            if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
                System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
            } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
                System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
            } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
                System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
            }
            //loading time for supply list
            Thread.sleep(700);
            HashSet<String> supplies = new HashSet<>();

            supplies.add("Phone");
            supplies.add("Healing capsule");
            supplies.add("Water");

            System.out.println("Supplies before the expedition: " + supplies + " ");

            supplies.remove("Phone");
            System.out.println("Supplies after the expedition: " + supplies + " ");
    }

}