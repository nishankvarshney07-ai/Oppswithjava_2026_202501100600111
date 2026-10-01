
class Student{
    int age;
    int rollno;
    String name;


    Student(String name,int rollno,int age){
        this.name = name;
        this.age = age;
        this.rollno = rollno;

    }

    void Study(){
        System.out.println(name +" "+ rollno +" " + age);
    }
}
public class Practice{
    public static void main(String[] args) {
        Student obj = new Student("Varshney", 155, 20);
        obj.Study();
    }
}





