class Employee{

    int calculateBonus(){
        return 50000;
    }
}
class Manager extends Employee{
    @Override
    int calculateBonus(){
        return 100000;
    }
}
class Developer extends Employee{
    @Override 
    int calculateBonus(){
        return  5949949;
    }
}
public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Manager();
        Employee e2 = new Developer();

        System.out.println("Manager Bonus: "
                + e1.calculateBonus());

        System.out.println("Developer Bonus: "
                + e2.calculateBonus());
    }
}

