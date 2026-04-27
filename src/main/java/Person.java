/**
 * class about person
 * @author Eric Wang
 */
public class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[]{};

    /**
     * constructor taking in everything except siblings
     * @param firstname String, first name of person
     * @param lastname String, last name of person
     * @param birthDay int, birth day of person
     * @param birthMonth int, birth month of person
     * @param birthYear int, birth year of person
     * @param ssn String, social security number of person
     */
    public Person (String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }
    /**
     * gets first name of person
     * @return  returns String first name of person
     */
    public String getFirstname() {
        return firstname;
    }
    /**
     * gets last name of person
     * @return  returns String last name of person
     */
    public String getLastname() {
        return lastname;
    }
    /**
     * sets new value for first name
     * @param firstname String, value to set first name to
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    /**
     * sets new value for last name
     * @param lastname String, value to set last name to
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    /**
     * gets birthday of person
     * @return returns String of birthday in dd/mm/yyyy format
     */
    public String getBirthday() {
        return birthDay+"/"+birthMonth+"/"+birthYear;
    }

    /**
     * adds sibling to person
     * @param a Person, sibling to be added
     */
    public void addSibling (Person a) {
        if (a==null) {
            return;
        }
        Person[] clone = new Person[numberOfSiblings+1];
        for (int i = 0; i < numberOfSiblings; i++) {
            clone[i] = siblings[i];
        }
        clone[numberOfSiblings] = a;
        siblings = clone;
        numberOfSiblings++; 
    }

    /**
     * gets siblings of person
     * @return returns Person array of siblings
     */
    public Person[] getSiblings() {
        return siblings;
    }
}