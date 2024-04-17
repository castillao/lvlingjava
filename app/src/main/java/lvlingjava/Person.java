package lvlingjava;

public class Person {
    private String firstName;
    private String lastName;
    private int id;
    private static int counter = 1;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = counter;
        counter++;
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
    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
    }
}
