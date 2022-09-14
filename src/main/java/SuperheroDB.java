import java.util.ArrayList;

public class SuperheroDB {
    private ArrayList<Superheroes> superheroes = new ArrayList<>();

    public ArrayList<Superheroes> getSuperheroes() {
        return superheroes;
    }

    public void createSuperHero(String firstName, String lastName, String alias, String powers, int yearOfOrigin, double powerlvl, boolean race) {
        Superheroes hero = new Superheroes(firstName, lastName, alias
                , powers, yearOfOrigin, powerlvl, race);


        superheroes.add(hero);


        System.out.println("listen: ");

        for (Object superheroes : superheroes) {
            System.out.println(superheroes);
        }
        System.out.println("-----------");
    }
}