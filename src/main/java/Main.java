import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

        System.out.println("Er din helt menneske:  ");
        boolean race = scanner.nextBoolean();

        Superheroes s1 = new Superheroes (firstName,lastName,alias,powers,powerlvl,race);
        Superheroes s2 = new Superheroes (firstName,lastName,alias,powers,powerlvl,race);
        Superheroes s3 = new Superheroes (firstName,lastName,alias,powers,powerlvl,race);
        Superheroes s4 = new Superheroes (firstName,lastName,alias,powers,powerlvl,race);

        Superheroes[] list = {s1,s2,s3,s4};
        for (Superheroes superheroes : list) {
            System.out.println("Din helt hedder altså "+superheroes.getFirstName()+" "+superheroes.getLastName()+" og går under navnet "+superheroes.getAlias()+" Hans superkræfter er: "+superheroes.getPowers()+" med et styrkeniveau på "+superheroes.getPowerlvl()+" Hans menneske status er "+superheroes.getRace());
        }
        //System.out.println("Din helt hedder altså " + s1.getFirstName()+" "+s1.getLastName()+ " og går under navnet "+s1.getAlias()+" Hans superkræfter er: "+s1.getPowers() + " med et styrkeniveau på " + s1.getPowerlvl() + "Hans menneske status er " + s1.getRace());

    }
}