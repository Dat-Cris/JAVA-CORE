package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Tính đa hình
        // student -> person
        student student = new student("huy", 24);
        student.run;
        student.study();
        Person person = (Person) student;
        person.run();

        // instanceof
        if (person instanceof student) {
            Student s = (student) person;
            s.study();
        }

    }
}
