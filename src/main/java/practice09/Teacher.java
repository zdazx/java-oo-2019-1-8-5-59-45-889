package practice09;

public class Teacher extends Person {
    private Klass klass;

    Teacher(int id, String name, int age){
        super(id, name, age);
    }

    Teacher(int id, String name, int age, Klass klass){
        super(id, name, age);
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
