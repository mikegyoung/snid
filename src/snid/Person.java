package snid;

import java.util.ArrayList;

/**
 * 
 * @author Michael Young
 * @version 1.0
 */

public abstract class Person {
    private char gender;
    private int yob;
    private char status;
    private Person mother, father;
    private ArrayList<Biometric> biodata;

    /**
     * Person class constructor
     * 
     * @param gender gender of person
     * @param yob    year of birth of person
     */
    public Person(char gender, int yob) {
        this.gender = gender;
        this.yob = yob;

    }

    /**
     * Method to return identification number of a person
     * 
     * @return unique id of a person
     */
    public abstract String getId();

    /**
     * Method to return gender of person
     * 
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * Method to return year of birth
     * 
     * @return year of birth
     */
    public int getYOB() {
        return yob;
    }

    /**
     * Method to return person's life status
     * 
     * @return life status
     */
    public char getLifeStatus() {
        return status;
    }

    /**
     * Method to set the life status of a person
     * 
     * @param status value to determine life staus of a person
     */
    public void setLifeStatus(int status) {
        if (status == 0) {
            this.status = 'A';
        }
        if (status == 1) {
            this.status = 'D';
        }
    }

    /**
     * Method to set parent
     * 
     * @param type   mother or father
     * @param parent the parent
     */
    public void setParent(char type, Person parent) {
        if (type == 'M') {
            mother = parent;
        }
        if (type == 'F') {
            father = parent;
        }
    }

    /**
     * Method to return the parent of a person
     * 
     * @param type The type of the parent to be returned
     * @return parent(mother or father)
     */
    public Person getParent(char type) {
        if (type == 'M') {
            return mother;
        } else {
            return father;
        }

    }

    /**
     * Method to add Biometric information
     * 
     * @param data the biometric information of a person
     */
    public abstract void addBiometric(Biometric data);

    /**
     * Method to return biometric information
     * 
     * @param tag tba
     * @return biometric information
     */
    public abstract Biometric getBiometric(String tag);

    /**
     * Method to display the data of a person
     * 
     * @return The data of a person as a formatted String
     */
    public abstract String toString();

}