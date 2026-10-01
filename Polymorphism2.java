class Animal{
    void sound(){
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{// we have used runtime polymorphism and i have also learned compile time polymorphism , in compile timme poly we see parameterms , so we run it by that 
    @Override 
    void sound(){
        System.out.println("Cat barks");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a2.sound();
        a1.sound();
    }// so if we see many of the paper that comes in exam is set by the examinar of our college and this is question is very important , i will do it inn no time now
}
