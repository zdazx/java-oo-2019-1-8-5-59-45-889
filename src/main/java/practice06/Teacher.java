package practice06;

public class Teacher extends Person {
    private int klass;

    Teacher(String name, int age){
        super(name, age);
    }

    Teacher(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() +
                (klass == 0 ?
                        " I am a Teacher. I teach No Class." :
                        " I am a Teacher. I teach Class "+getKlass()+".");
    }
}
