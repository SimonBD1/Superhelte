import java.util.Scanner;

public class Main {
    // Database database = new Database();
   // private Superheroes superheroes = new Superheroes();

    public static void main(String[] args) {
      //  Superheroes hero1 = new Superheroes ("Ole","hansen","luder","luder",99);
        System.out.println("Velkommen til superhelteverdenen");
        System.out.println("Indtast den superhelt du leder efter eller opret en ny: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vi kender ikke den superhelt, opret en ny superhelt");
        System.out.println("Indtast fornavn på Superhelt: ");
        String firstName = scanner.nextLine();
        System.out.println("Indtast et efternavn, hvis har et: ");
        String lastName = scanner.nextLine();
        System.out.println("Indtast alias hvis har et: ");
        String alias = scanner.nextLine();
        System.out.println("Indtast Superhelte kræfter: ");
        String powers = scanner.nextLine();
        System.out.println("Indtast styrkeniveau:  ");
        double powerlvl = scanner.nextDouble();
        System.out.println("Er den helt menneske:  ");
        boolean race = scanner.nextBoolean();

        Superheroes s1 = new Superheroes (firstName,lastName,alias,powers,powerlvl,race);

    }
}