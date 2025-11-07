public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String surname;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    @Override   
    public String toString() {
        return id + " - " + name + " " + surname;
    }
}
