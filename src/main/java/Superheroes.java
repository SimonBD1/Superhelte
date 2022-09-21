public class Superheroes {

    private String firstName;
    private String lastName;
    private String alias;
    private String powers;
    private int yearOfOrigin;
    private double powerlvl;
    private boolean race;

    public Superheroes(String firstName, String lastName, String alias, String powers, int yearOfOrigin, double powerlvl, boolean race) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.alias = alias;
        this.powers = powers;
        this.yearOfOrigin = yearOfOrigin;
        this.powerlvl = powerlvl;
        this.race = race;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String LName){
        this.lastName=LName;
    }

    public String getAlias() {
        return alias;
    }

    public String getPowers() {
        return powers;
    }

    public int getYearOfOrigin() {
        return yearOfOrigin;
    }
    public void setYearOfOrigin(int newYearOfOrigin) {
        this.yearOfOrigin= Integer.parseInt(String.valueOf(newYearOfOrigin));
    }

    public double getPowerlvl() {
        return powerlvl;
    }

    public boolean getRace() {
        return race;
    }


    public void setRace(boolean race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "\n" + firstName + ' ' + lastName + " bedre kendt som " + alias + "\n Superkræfter er: " + powers +
                "\n Først set i år " + yearOfOrigin +
                "\n Styrkeniveau er på: " + powerlvl +
                "\n Menneskestatus: " + raceCheck() +
                "\n---------";
    }

    public String raceCheck() {
        if (race == true) {
            return "Menneskelig";
        } else {
            return "Ikke menneskelig";
        }
    }
}