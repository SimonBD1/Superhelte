import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        boolean race = false;
        SuperheroDB superheroDB = new SuperheroDB();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til superhelteverdenen:");


        do {
            System.out.println("\nTast 1 for oprettelse af ny superhelt" +
                    "\nTast 5 for at finde allerede eksisterende superhelt" +
                    "\nTast 9 for at afslutte");

            int menuchoice = scanner.nextInt();

            if (menuchoice == 1) {
                scanner.nextLine(); //
                System.out.println("Indtast fornavn på Superhelt: ");
                String firstName = scanner.nextLine();

                System.out.println("Indtast et efternavn, hvis har et: ");
                String lastName = scanner.nextLine();

                System.out.println("Indtast alias hvis har et: ");
                String alias = scanner.nextLine();

                System.out.println("Indtast Superhelte kræfter: ");
                String powers = scanner.nextLine();

                System.out.println("indtast oprindelsesår");
                int yearOfOrigin = scanner.nextInt();

                System.out.println("Indtast styrkeniveau:  ");
                double powerlvl = scanner.nextDouble();

                System.out.println("Er din helt menneske y/n:  ");

                String answer = scanner.next();
                while (!answer.equals("y") && !answer.equals("n")) {
                    System.out.println("Ugyldig indtastning\ny/n, tak");
                    answer = scanner.next();

                }
                if (answer.equals("y")) {
                    race = true;
                } else if (answer.equals("n")) {
                    race = false;
                }


                superheroDB.createSuperHero(firstName, lastName, alias, powers, yearOfOrigin, powerlvl, race);

            } else if (menuchoice == 5) {
                System.out.println(superheroDB.getSuperheroes());

            } else if (menuchoice == 9) {
                System.exit(9);
                scanner.nextInt();
                System.out.println("Afsluter progammet...");
            }
        }
        while (true);
    }
}