import java.util.Scanner;
public class Scan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name =  sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("age: " + age);


    }
}