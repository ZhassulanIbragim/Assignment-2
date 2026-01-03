public abstract class Person implements Payable, Comparable<Person> {

    private static int idCounter = 1;

    protected int id;
    protected String name;
    protected String surname;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
