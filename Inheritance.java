class Person{
    int age;
    String name;

     void study(){
        System.out.println(name + "is studing");
    }

}          
class Student extends Person{
    int rollno;
    void introduce(){
        System.out.println(name + rollno + "is studying");
    }
}



public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Nisjank";
        s.age = 15;
        s.rollno = 344;
        s.introduce();
        s.study();                                  
    }
}
