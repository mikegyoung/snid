package snid;

/**
 * 
 * @author Michael Young
 * @version 1.0
 */

public class Citizen extends Person implements Comparable<Citizen> {
    private Name name;
    private Integer id;
    private static int count = 0;
    Address address;

    /**
     * Constructor for Citizen object
     * 
     * @param gender male or female
     * @param yob    year of birth of citizen
     * @param fname  first name of citizen
     * @param mname  last name of citizen
     * @param lname  middle name of citizen
     */
    public Citizen(char gender, int yob, String fname, String mname, String lname) {
        super(gender, yob);
        name = new Name(fname, mname, lname);
        id = ++count; // generation of unique identifier for each citizen
    }

    /**
     * Method to retrieve citizen unique identifier
     */
    public String getId() {
        return id.toString();
    }

    /**
     * Method to set the address for a citizen
     * 
     * @param address An address object
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Method to change last name of a citizen
     * 
     * @param newlname new last name for citizen
     */
    public void changeLastName(String newlname) {
        name.setLastName(newlname);
    }

    /**
     * Method to retrieve the address of a citizen;
     * 
     * @return address of citizen
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Method to add Biometric information
     * 
     * @param data the biometric information of a person
     */
    public void addBiometric(Biometric data) {
        // code to be added
    }

    /**
     * Method to return biometric information
     * 
     * @param tag tba
     * @return null
     */
    public Biometric getBiometric(String tag) {
        // code to be added
        return null;
    }

    /**
     * Method to compare citizens by their unique identifier
     * 
     * @param c2 citizen to be compared to
     * @return the comparison between the two citizen Ids
     */
    public int compareTo(Citizen c2) {
        return this.getId().compareTo(c2.getId());
    }

    /**
     * Method to retrieve the name of a Citizen
     * 
     * @return a formatted String with a Citizen's name
     */
    public String getName() {
        return name.getLastName().toUpperCase() + ", " + name.getFirstName() + " " + name.getMiddleName().charAt(0)
                + ".";
    }

    public String toString() {
        return " ";
    }

}