package persons;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Valdemar", 23);
        System.out.println(person1);

        person1.setName("Big Hank");
        System.out.println(person1);
    }
}
