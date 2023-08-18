import java.rmi.MarshalException;

public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Diamond";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * 0.5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        GuessingGame guessingGame = new GuessingGame();
        MarsExpedition marsExpedition = new MarsExpedition();
        FindingsList findingsList = new FindingsList();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute < minutesLeft; minute++) {
            if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("left");
            } else if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
            System.out.println("Landed");
        }
        return false;
    }
}