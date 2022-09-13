import java.util.ArrayList;

public class SuperheroDB {
   private ArrayList <Superheroes> superheroes= new ArrayList<>();

  //  private Superheroes [] list = new Superheroes[5];
   // private int index = 0;
    public void createSuperHero(String firstName, String lastName, String alias, String powers, int yearOfOrigin, double powerlvl, boolean race) {
        Superheroes hero = new Superheroes(firstName,lastName,alias
                ,powers,yearOfOrigin,powerlvl,race);
        superheroes.add(hero);
       // list [index]= hero;
      //  index++;

        System.out.println("listen: ");
        for (Object superheroes : superheroes){
            System.out.println(superheroes);
        }
        System.out.println("-----------");
    }
}