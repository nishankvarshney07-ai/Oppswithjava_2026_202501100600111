public class Hello{
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        System.out.println("Hello World");
        System.out.println(a+b);
        b=b+1;
        System.out.println(a+b);
        if((a+b)<12){
            System.out.println("Adult");
        }
        for(int i=0;i<=5 ;i++){
            System.out.println(i);
        }
        String name="Nishank";
        System.out.println(name);
        int age = 19;
        double percentage = 85.5;
        char grade = 'A';
        boolean passed = true;
         System.out.println(age);
        System.out.println(percentage);
        System.out.println(grade);
        System.out.println(passed);
        System.out.println("My name is " + name + "and age is " + age);

    }
}