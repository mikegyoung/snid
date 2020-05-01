package snid;

/**
 * @author Michael Young
 * @version 1.0
 */

public interface Biometric {
    /**
     * 
     * @return the tag
     */
    public String getTag();

    /**
     * 
     * @return the value
     */
    public String getValue();

    /**
     * 
     * @param other Biometric data entered
     * @return tba
     */
    public int match(Biometric other);
}