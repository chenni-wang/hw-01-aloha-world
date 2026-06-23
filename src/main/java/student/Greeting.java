package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * <p>
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */

/**
 * This Greeting class stores the locality ID, locality name, and a string format of the greeting both ascii and unicode.
 */
public class Greeting {
    /**
     * localityID: int value of locality
     * localityName: name of locality
     * asciiGreeting: ascii characters for the greeting
     * unicodeGreeting: unicode characters for the greeting
     * formatStr:the greeting
     */
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * This is the constructor for the greeting class. Default greeting that creates "Hello, {name}!".
     * @param localityID int value of locality
     * @param localityName name of locality
     */
    public Greeting(int localityID, String localityName) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = "Hello";
        this.unicodeGreeting = "Hello";
        this.formatStr = "%s, %%s!";
    }

    /**
     * This is the constructor for the greeting class.
     * Greeting that creates a greeting with ascii and unicode characters assuming the language is already using ascii letters only.
     * @param localityID int value of locality
     * @param localityName name of locality
     * @param greeting ascii characters for the greeting
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = greeting;
        this.unicodeGreeting = greeting;
        this.formatStr = "%s, %%s!";
    }

    /**
     * This is the constructor for the greeting class.
     * Greeting that creates a greeting with ascii and unicode characters.
     * @param localityID int value of locality
     * @param localityName name of locality
     * @param asciiGreeting ascii characters for the greeting
     * @param formatStr the greeting
     * @param unicodeGreeting unicode characters for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }


    /**
     * Returns the locality id number.
     * @return the locality id number.
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Returns the locality name.
     * @return the locality name.
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Returns the ascii greeting.
     * @return the ascii greeting.
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Returns the unicode greeting.
     * @return the unicode greeting.
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Gets the unicode format string.
     * @return the unicode format string.
     */
    public String getFormatStr() {
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format.
     * @param asciiOnly boolean value to decide use asciicode or unicode
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(this.formatStr, this.asciiGreeting);
        }

        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Return the string representation of the object
     * @return the string representation of the object
     */
    @Override
    public String toString() {
        String str;
        str = String.format("{localityID:%s, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                this.localityID, this.localityName, this.asciiGreeting, this.unicodeGreeting);
        return str;
    }

}
