package snid;

/**
 * @author Michael Young
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Address {
    private ArrayList<String> address;

    /**
     * Constructor for Address object
     * 
     * @param lines Address information inputted in one line
     */
    public Address(String lines) {
        String[] arr_lines = lines.split("\\|"); // converting string to an array
        this.address = new ArrayList<String>(Arrays.asList(arr_lines)); // converting array to an Arraylist
        this.address.removeAll(Arrays.asList("")); // removal of blank spaces from arraylist
    }

    /**
     * Method to return country from address
     * 
     * @return Country portion of address
     */
    public String getCountry() {
        return address.get(address.size() - 1);

    }

    /**
     * Address toString Method
     * 
     * @return a formatted string of a address object
     */
    public String toString() {
        String result = "";
        for (int i = 0; i < address.size() - 1; i++) {
            result += address.get(i) + "\n";
        }
        return result + getCountry();
    }
}