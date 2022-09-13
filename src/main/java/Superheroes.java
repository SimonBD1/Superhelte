public class Superheroes {

    private String firstName;
    private String lastName;
    private String alias;
    private String powers;
    private int yearOfOrigin;
    private double powerlvl;
    private boolean race;

    public Superheroes (String firstName, String lastName, String alias, String powers,int yearOfOrigin, double powerlvl, boolean race){
        this.firstName=firstName;
        this.lastName=lastName;
        this.alias=alias;
        this.powers=powers;
        this.yearOfOrigin=yearOfOrigin;
        this.powerlvl=powerlvl;
        this.race=race;
    }

public String getFirstName () {
        return firstName;
}
public String getLastName () {
        return lastName;
}
public String getAlias () {
        return alias;
}
public String getPowers () {
        return powers;
}
public int getYearOfOrigin () {
        return yearOfOrigin;
}
public double getPowerlvl(){
        return powerlvl;
}
public boolean getRace() {
        return race;
}

    @Override
    public String toString() {
        return firstName + lastName + alias+powers+yearOfOrigin+powerlvl+race;
    }
}