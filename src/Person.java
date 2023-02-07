public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private String countryOfBirth;

    public Person(String firstName, String lastName, int age, char gender, String countryOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.countryOfBirth = countryOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    @Override
    public String toString() {
        return "\nPerson" +
                "\nFirst name: " + firstName +
                "\nLast  name: " + lastName +
                "\nAge: " + age +
                "\nGender: " + gender +
                "\nCountry of birth: " + countryOfBirth;
    }

    public String work(String work) {
        return "\nPerson " +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nWork: " + work;
    }

    public String eat(String foot) {
        return "\nName person: " + firstName +
                "\nhad a " + foot + " today";

    }
}
