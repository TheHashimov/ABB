import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        LinkedList<Person> linkedList = new LinkedList<>();

        arrayList.add(new Person(3, "Ali", "Huseynov"));
        arrayList.add(new Person(1, "Vusal", "Hashimov"));
        arrayList.add(new Person(2, "Rashad", "Mammadov"));

        linkedList.add(new Person(6, "Murad", "Aliyev"));
        linkedList.add(new Person(5, "Nigar", "Karimova"));
        linkedList.add(new Person(4, "Aysel", "Mehdiyeva"));

        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList:");
        arrayList.forEach(System.out::println);

        linkedList.sort(Comparator.comparingInt(Person::getId));
        System.out.println("\nSorted LinkedList:");
        linkedList.forEach(System.out::println);

        arrayList.addAll(linkedList);

        System.out.println("\nMerged list size: " + arrayList.size());

        linkedList.clear();
        System.out.println("LinkedList cleared, size: " + linkedList.size());
    }
}
