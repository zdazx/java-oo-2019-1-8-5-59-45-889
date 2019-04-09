package practice02;

public class Person {
    private String name;
    private int age;

    Person(){}

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        String intro = "My name is " +
                getName() + ". I am "+
                getAge() + " years old.";
        return intro;
    }
}
