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
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
        public String getLastName () {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getAlias () {
        return alias;
    }
    public void setAlias(String alias){
        this.alias=alias;
    }

    public String getPowers () {
        return powers;
    }
    public void setPowers(String powers){
        this.powers=powers;
    }
    public double getPowerlvl(){
        return powerlvl;
    }

    public void setPowerlvl(double powerlvl) {
        this.powerlvl = powerlvl;
    }

    public boolean getRace() {
        return race;
    }
    public void setRace(){
        this.race=race;
    }
}
