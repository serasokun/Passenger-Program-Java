import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char passClass ;
        double bagWight;

        int numberOfGroupes;
        System.out.println("please Enter the number of Groups " );
      
        numberOfGroupes= input.nextInt();

        for(int groupeCounter=1; groupeCounter<=numberOfGroupes; groupeCounter++ ) {

            System.out.println("How many Guest of the group number " + groupeCounter+ "have we here");
            int numberOfPassengers;
            numberOfPassengers=input.nextInt();
            for (int counter = 1; counter <= numberOfPassengers; counter++) {
                System.out.println("Passenger number " + counter);
                System.out.println("Hello and welcome! May you chose your Class (Ff for First Class ,Ee for Economy)");

                passClass = input.next().charAt(0);
                System.out.println("What is your Bag Wight ? ");
                bagWight = input.nextDouble();

                double extraBagWight = 0;
                double extraCharge = 0;

                switch (Character.toUpperCase(passClass)) {
                    case 'F':
                        if (bagWight > 30) {

                            extraBagWight = bagWight - 30;
                            extraCharge = extraBagWight * 10;
                        }
                        break;

                    case 'E':
                        if (bagWight > 25) {
                            extraBagWight = bagWight - 25;
                            extraCharge = extraBagWight * 10;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice only E or F ");
                        continue;
                }
                System.out.println("extra Bag wight is  " + extraBagWight);
                System.out.println("and the extra charge is " + extraCharge);

            }
        }

    }
}
