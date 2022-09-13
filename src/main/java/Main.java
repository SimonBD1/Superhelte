import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SuperheroDB superheroDB = new SuperheroDB();

        System.out.println("Velkommen til superhelteverdenen");

        System.out.println("Indtast 1 for oprettelse af ny superhelt tast 5 for at finde allerede eksisterende superhelt");
        Scanner scanner = new Scanner(System.in);
        int menuchoice = scanner.nextInt();

        scanner.nextLine(); //
        if (menuchoice==1){
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

            System.out.println("Er din helt menneske:  ");
            boolean race = scanner.nextBoolean();

            superheroDB.createSuperHero(firstName, lastName, alias, powers, yearOfOrigin, powerlvl, race);
            System.out.println(superheroDB);
        }
        if (menuchoice==5){
            scanner.nextLine();
        }
    }
}