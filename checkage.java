



class Student{
    private int age ;
    private String name;

    public void Setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void Setage(int age){
        if(age>0){
            this.age = age;
        }
    }
    public int getage(){
        return age;
    }
}


public class checkage {
    public static void main(String[] args) {
        Student S = new Student();
    


    S.Setname("Nishank");
    S.Setage(19);


    System.out.println(S.getname());
    System.out.println(S.getage());
    }
}
