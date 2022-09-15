import java.util.Scanner;

public class UserInterface {
    boolean race = false;
    SuperheroDB superheroDB = new SuperheroDB();
    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        superheroDB.createTestData();
        System.out.println("Velkommen til superhelteverdenen:");
        do {
            startpage();
            int menuchoice = scanner.nextInt();
            if (menuchoice == 1) {
                createSuperHero();
            } else if (menuchoice == 2) {
                searchSuperHero();
            } else if (menuchoice == 5) {
                printAllSuperhero();
            } else if (menuchoice == 9) {
                closeprogram();
            }
        } while (true);
    }

    public void startpage() {
        System.out.println("\nTast 1 for oprettelse af ny superhelt" + "\nTast 2 for at søge efter superhelt" +
                "\nTast 5 for at finde hele listen af eksisterende superhelte" +
                "\nTast 9 for at afslutte");
    }

    public void createSuperHero() {
        scanner.nextLine();
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
    }

    public void printAllSuperhero() {

        System.out.println(superheroDB.getSuperHeroesDB());
    }

    public void searchSuperHero() {
        System.out.println("Søg efter superhelt:");
        String searchTerm = scanner.next();
        Superheroes Found = superheroDB.searchFor(searchTerm);
        if (Found == null) {
            System.out.println("Intet resultat fundet med søgekriterierne: " + searchTerm);
        } else {
            System.out.print(Found.getFirstName() + " ");
            System.out.println(Found.getLastName());
            System.out.println("også kendt som " + Found.getAlias());
            System.out.println("Først set i år " + Found.getYearOfOrigin());
            System.out.println("Superhelte kræfter indebærer: " + Found.getPowers());
            System.out.println("Styrkeniveau er oppe på: " + Found.getPowerlvl());
            System.out.println("Menneske status: " + Found.raceCheck());
        }
    }

    public void closeprogram() {
        System.out.println("Lukker programmet...");
        System.exit(9);
    }
}