public class Person {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "I am a person and my name is " + name + ' ' +
                ", and I'm " + age + " years old.";

    }

    public Person() {
        name = "unknown";
        age = 0;
    }

    public Person(String myName) {
        name = myName;
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Print(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    public void eat(String food){
        System.out.println("Im eating some "+ food);
    }
}
