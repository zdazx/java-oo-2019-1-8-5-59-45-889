package practice11;

public class Person {
    private int id;
    private String name;
    private int age;

    Person(){}

    Person(int id, String name,int age){
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {
        Person person = (Person)obj;
        if(this == person){
            return true;
        }
        if(person == null){
            return false;
        }
        if(getClass() != person.getClass()){
            return false;
        }
        return (this.id == person.id);
    }
}
