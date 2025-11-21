public class Person {
    private String name;
    private int age;
    private int salary;
    private char gender;

    public Person(String personName, int personAge) {
        // here name and age are instance variables, personName and personAge are parameters.
        // this keyword is used to refer to the current object.
        this.name = personName;
        this.age = personAge;
    }

    public Person(String personName, int personAge, int personSalary, char personGender) {
        this.name = personName;
        this.age = personAge;
        this.salary = personSalary;
        this.gender = personGender;
    }

    public void getName() {
        System.out.println("The name of this person is: " + this.name);
    }

    public void getAge() {
        System.out.println("The age of this person is: " + this.age);
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary=" + salary + ", gender=" + gender + "}";
    }
}
