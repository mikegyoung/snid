package snid;

/**
 * @author Michael Young
 * @version 1.0
 */

public class Name {
    private String firstName;
    private String lastName;
    private String middleName;

    /**
     * Constructor for Name Class
     * 
     * @param firstName  fisrt name
     * @param middleName middle name
     * @param lastName   last name
     */
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * Method to display first name
     * 
     * @return First name of person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method to display last name
     * 
     * @return Last name of person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method to display middle name
     * 
     * @return Middle Name of person
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Method to set the last name
     * 
     * @param lastName Last Name of person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method to return a formatted string of Name class data
     * 
     * @return Name class data as a formatted String
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

    /**
     * Method to check if two names are the same
     * 
     * @param name another Name to be compared against
     * @return true or false
     */
    public boolean equals(Name name) {
        return (this.getFirstName().equalsIgnoreCase(name.getFirstName())
                && this.getMiddleName().equalsIgnoreCase(name.getMiddleName())
                && this.getLastName().equalsIgnoreCase(name.getLastName()));
    }
}