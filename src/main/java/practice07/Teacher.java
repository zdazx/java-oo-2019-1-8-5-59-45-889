package practice07;

public class Teacher extends Person {
    private Klass klass;

    Teacher(String name, int age){
        super(name, age);
    }

    Teacher(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() +
                (klass == null ?
                        " I am a Teacher. I teach No Class." :
                        " I am a Teacher. I teach "
                                +getKlass().getDisplayName()+".");
    }

    public String introduceWith(Student student){
        return super.introduce() + " I am a Teacher. " +
                (
                        (student.getKlass().getNumber() == this.getKlass().getNumber()) ?
                                "I teach " :
                                "I don't teach "
                ) + student.getName() + ".";
    }
}
