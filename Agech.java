import java.util.Scanner;
class Age extends Exception {
    Age(String message){
        super(message);
    }
}
public class Agech {
    static void checkage(int age) throws Age{
        if(age < 18){
            throw new Age("Age is invalid. You are not eligible to vote.");
        }
        System.out.println("You are eligible too vote");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        try{
            checkage(age);
        }
        catch(Age e){
            System.out.println(e.getMessage());
        }
    }
}
