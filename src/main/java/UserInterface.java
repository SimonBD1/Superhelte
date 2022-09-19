import java.util.ArrayList;
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
            } else if (menuchoice == 3) {
                editSuperhero();
            } else if (menuchoice == 9) {
                closeprogram();
            }
        } while (true);
    }

    public void startpage() {
        System.out.println(
                """

                        Tast 1 for oprettelse af ny superhelt
                        Tast 2 for at søge efter superhelt
                        Tast 3 for at redigere i en superhelt
                        Tast 5 for at finde hele listen af eksisterende superhelte
                        Tast 9 for at afslutte""");
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
        ArrayList<Superheroes> searchResults = superheroDB.searchSuperhero(searchTerm);
        if (searchResults.isEmpty()) {
            System.out.println("Intet resultat fundet med søgekriterierne: " + searchTerm);
        } else {
            for (Superheroes found : searchResults) {
                System.out.print(found.getFirstName() + " ");
                System.out.println(found.getLastName());
                System.out.println("også kendt som " + found.getAlias());
                System.out.println("Først set i år " + found.getYearOfOrigin());
                System.out.println("Superhelte kræfter indebærer: " + found.getPowers());
                System.out.println("Styrkeniveau er oppe på: " + found.getPowerlvl());
                System.out.println("Menneske status: " + found.raceCheck());
                System.out.println(" ");
            }
        }
    }

    public void editSuperhero() {
        boolean writingError = false;
        {
            System.out.println("Vælg den superhelt du vil redigere: ");
            for (int i = 0; i < superheroDB.getSuperHeroesDB().size(); i++) {
                System.out.println(i + 1 + ")" + superheroDB.getSuperHeroesDB().get(i));
            }
            System.out.println("Indtast nummeret på den valgte superhelt: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            Superheroes editHero = superheroDB.getSuperHeroesDB().get(number - 1);
            System.out.println("Redigere superhelt information: " + editHero);

            do {
                    System.out.println("Indskriv ny data. Vil du ikke redigiere tryk Enter.");
                System.out.println("Navn: " + editHero.getFirstName());
                String newName = scanner.nextLine();
                if (!newName.isEmpty())
                    try {
                        editHero.setFirstName(newName);
                        writingError=false;
                    } catch (NumberFormatException e) {
                        System.out.println("Fejl, brug ikke numre i navn!");
                        writingError=true;
                    }


            } while (writingError==true);
        }
    }

    public void closeprogram() {
        System.out.println("Lukker programmet...");
        System.exit(9);
    }
}