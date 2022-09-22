import java.util.ArrayList;

public class SuperheroDB {
    private ArrayList<Superheroes> superHeroesDB = new ArrayList<>();

    public void createTestData() {
        createSuperHero("Manner", "Mogensen", "Mugge", "Flyve stærkt", 1888, 12.2, true);
        createSuperHero("Mandrup", "Plum", "Plummesen", "Flyve langsomt", 1995, 1.2, true);
        createSuperHero("Kjart", "Skat", "Mandemanden", "Fodbold", 2211, 9, true);
        createSuperHero("Tobi", "Basse", "Bassemanden", "Bare tænk på hulk", 2001, 12.2, true);
    }

    public ArrayList<Superheroes> getSuperHeroesDB() {
        return superHeroesDB;
    }

    public ArrayList<Superheroes> searchSuperhero(String searchTerm) {
        ArrayList<Superheroes> searchResult = new ArrayList<>();

        for (Superheroes superheroes : superHeroesDB) {
            if (superheroes.getFirstName().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResult.add(superheroes);
            }
            if (superheroes.getLastName().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResult.add(superheroes);
            }
        }
        return searchResult;
    }

    public Superheroes createSuperHero(String firstName, String lastName, String alias, String powers, int yearOfOrigin, double powerlvl, boolean race) {

        Superheroes hero = new Superheroes(firstName, lastName, alias
                , powers, yearOfOrigin, powerlvl, race);

        superHeroesDB.add(hero);
        return hero;
    }

    public boolean deleteSuperheroes(Superheroes superheroes) {
        getSuperHeroesDB().remove(superheroes);
        boolean success = true;
        return success;
    }
}