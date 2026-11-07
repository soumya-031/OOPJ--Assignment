class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Rahul", 20);
        Person person2 = new Person("Priya", 22);

        
        System.out.println("Person 1: Name = " + person1.name + ", Age = " + person1.age);
        System.out.println("Person 2: Name = " + person2.name + ", Age = " + person2.age);
    }
}