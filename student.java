class student {
    String name;
    int age;
    int rollNo;

    student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void study() {
        System.out.println(name + "is studying");
    }
    

    public static void main(String[] args) {
        student s1 = new student("Nishank", 19, 101);

        System.out.println(s1.name + " " + s1.age + " " + s1.rollNo);
        s1.study();
    }
}
