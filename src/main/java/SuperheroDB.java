public class SuperheroDB {
    private String firstName;
    private String lastName;
    private String alias;
    private String powers;
    private double powerlvl;
    private boolean race;

    public SuperheroDB (String firstName, String lastName, String alias, String powers, double powerlvl, boolean race){
        this.firstName=firstName;
        this.lastName=lastName;
        this.alias=alias;
        this.powers=powers;
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
    public double getPowerlvl(){
        return powerlvl;
    }
    public boolean getRace() {
        return race;
    }
}
