import java.util.ArrayList;

public class SuperheroDB {
    private ArrayList<Superheroes> superHeroesDB = new ArrayList<>();

    public void createTestData() {
        createSuperHero("malte", "mogensen", "mugge", "Flyve stærkt", 1888, 12.2, true);
        createSuperHero("Heidi", "Plum", "plummesen", "Flyve langsomt", 1995, 1.2, true);
        createSuperHero("kjart", "skat", "Mandemanden", "Fodbold", 2211, 9, true);
        createSuperHero("tobi", "Basse", "Bassemanden", "Bare tænk på hulk", 2001, 12.2, true);
    }

    public ArrayList<Superheroes> getSuperHeroesDB() {
        return superHeroesDB;
    }

    public Superheroes searchFor(String searchTerm) {
        for (Superheroes superheroes : superHeroesDB) {
            String name = superheroes.getFirstName();
            if (name.contains(searchTerm.toLowerCase())) {
                return superheroes;
            }
        }
        return null;
    }

    public void createSuperHero(String firstName, String lastName, String alias, String powers, int yearOfOrigin, double powerlvl, boolean race) {

        Superheroes hero = new Superheroes(firstName, lastName, alias
                , powers, yearOfOrigin, powerlvl, race);

        superHeroesDB.add(hero);
    }
}