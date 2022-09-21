import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroDBTest {

        SuperheroDB superheroDB;
        @BeforeEach
        public void setup() {
            superheroDB = new SuperheroDB();
        }



        @Test
        void createSuperHero() {
            superheroDB = new SuperheroDB();
            //Arrange
            superheroDB.createSuperHero("Bruce", "Wayne", "Batman", "penge",1942, 2, true );

            int expected = 1;

            //act
            int actual = superheroDB.getSuperHeroesDB().size();

            //assert
            assertEquals(expected,actual);

        }

        @Test
        void createMultipleSuperheroes(){
            //Arrange
            superheroDB.createSuperHero("Bruce", "Wayne", "Batman", "penge",1942, 2, true );
            superheroDB.createSuperHero("Clark", "Kent", "Superman", "Supermenneskelig styrke",1232,4 ,true );
            superheroDB.createSuperHero("Peter", "Parker", "Spider-Man", "Spider-Sense",1999 ,3,true );
            superheroDB.createSuperHero("Diana", "Prince", "Wonder Woman","Flyve", 1941,  2.5, true);

            int expected = 4;

            //Act
            int actual = superheroDB.getSuperHeroesDB().size();

            //assert
            assertEquals(expected,actual);
        }

        @Test
        void searchForZeroSuperhero() {

            //Arrange
            ArrayList<Superheroes> expected = new ArrayList<>(1);

            //act
            ArrayList<Superheroes> actual = superheroDB.searchSuperhero("man");

            //Assert
            assertEquals(expected,actual);
        }

        @Test
        void searchForOneSuperhero() {
            //Arrange
            Superheroes s2 = superheroDB.createSuperHero("Clark", "Kent", "Superman", "Supermenneskelig styrke",1232,4 ,true );


            ArrayList<Superheroes> expected = new ArrayList<>(1);

            expected.add(s2);


            //act
            ArrayList<Superheroes> actual = superheroDB.searchSuperhero("man");

            //Assert
            assertEquals(expected,actual);
        }

       @Test
        void searchForMultipleSuperheroes() {
            //Arrange
            Superheroes s1 = superheroDB.createSuperHero("Bruce", "Wayne", "Batman", "Penge",1942, 2, true );
            Superheroes s2 = superheroDB.createSuperHero("Clark", "Kent", "Superman", "Supermenneskelig styrke",1232,4 ,true );
            Superheroes s3 = superheroDB.createSuperHero("Peter", "Parker", "Spider-Man", "Spider-Sense",1999 ,3,true );
            Superheroes s4 = superheroDB.createSuperHero("Diana", "Prince", "Wonder Woman","Flyve", 1941,  2.5, true);
            ArrayList<Superheroes> expected = new ArrayList<>(4);

            expected.add(s1);
            expected.add(s2);
            expected.add(s3);
            expected.add(s4);

            //act
            ArrayList<Superheroes> actual = superheroDB.searchSuperhero("man");

            //Assert
            assertEquals(expected,actual);
        }
    @Test
    void deleteSuperheroes(){
        ArrayList<Superheroes> results = superheroDB.getSuperHeroesDB();

        Superheroes superheroes = results.get(0);
        boolean actualResult=superheroDB.deleteSuperheroes (superheroes);
        boolean expectedResult = true;

        assertEquals(actualResult,expectedResult);

        int expectedSize = results.size()-1;
        ArrayList<Superheroes> resultsAfterDelete = superheroDB.getSuperHeroesDB();
        int actualSize = resultsAfterDelete.size();
        assertEquals(expectedSize,actualSize);
    }
    }