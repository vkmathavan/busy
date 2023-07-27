package day1;

public class student {

    String name;

    int age;

    String department;

    public void getdata(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;

    }
public void print(){
    System.out.println("Name is: " + name);
    System.out.println("Age is: " + age);
    System.out.println("Department is: " + department);

}
}