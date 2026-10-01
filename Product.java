import java.util.*;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}

// Comparator class
class NameComparator implements Comparator<Student> {
 
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Product {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(20, "Rahul"));
        list.add(new Student(19, "Aman"));
        list.add(new Student(21, "Zoya"));

        // Sorting using Comparator
        Collections.sort(list, new NameComparator());

        for (Student s : list) {
            System.out.println(s);
        }
    }
}