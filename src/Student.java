public class Student extends Person {

    double gpa;

    public Student() {
        super();
        gpa = 3.0;
    }

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "I'm a student, my name is "+getName()+", my age is "+getAge()+" and my gpa is "+gpa;

    }

    public void withdraw(){
        System.out.println("I'm withdrawing");
    }

    @Override
    public void eat(String food){
        System.out.println("I would like to eat "+food+" but I can't afford it!");
    }
}
