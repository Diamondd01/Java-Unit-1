import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition (){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");

        System.out.println("Hi " + name + "  Welcome to the Expedition prep program. Are you ready to head out into the new world? (Input Y or N)");
        String response = input.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            System.out.println ("I knew you would say that. Your are the team leader for a reason ");
        } else if (response.equalsIgnoreCase("N")) {
            System.out.println("Too bad you are team leader. You have to go.");
        } else {
            System.out.println("Invalid. Input Y or N");
        }

        System.out.println("How many people do you want on your team ( Input an int number)");
        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2 ){
            System.out.println("That's way to many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize <2 ){
            System.out.println("That's not enough people. We need 2 more members");
        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good Job");
        }
        System.out.println("You are allowed to bring one snack with you. What do you want to bring");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing " + snack + " with you." );

        System.out.println("You have the choice of 3 Vehicles"  + "\nA: A Mars Rover" + "\nB: A Chevy Silverado" + "\nC: A Honda Accord");
        char choice = input.nextLine().charAt(0);

        String vehicleChoice = input.nextLine();
        switch (choice){
            case 'A':
                vehicleChoice = "Mars Rover";
                break;
            case 'B':
                vehicleChoice = "Chevy Silverado";
                break;
            case 'C':
                vehicleChoice = "Honda Accord";
                break;
        }
        System.out.println("Alright " + name + ". You are taking a team of " + teamSize + " with you on your expedition. Th snack you are bringing is " + snack + ". The vehicle you will be taking with you is a " + vehicleChoice +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...."+
                "\n2...."+
                "\n1...."+
                "\nGO GO GO!");
    }
}

