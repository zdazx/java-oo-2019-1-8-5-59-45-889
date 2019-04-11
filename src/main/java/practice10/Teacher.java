package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    Teacher(int id, String name, int age){
        super(id, name, age);
        classes = new LinkedList<>();
    }

    Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String intro = super.introduce() + " I am a Teacher. ";
        if (classes.size() == 0){
            intro += "I teach No Class.";
        }else {
            intro += "I teach Class ";
            for (Klass klass : classes) {
                intro += klass.getNumber() + ", ";
            }
            intro = intro.substring(0, intro.length() - 2);
            intro += ".";
        }
        return intro;
    }

    public String introduceWith(Student student){
        String intro = super.introduce() + " I am a Teacher. ";
        boolean flag = false;
        for (Klass klass : classes) {
            if(student.getKlass().getNumber() == klass.getNumber()){
                intro += "I teach ";
                flag = true;
                break;
            }
        }
        if(!flag){
            intro += "I don't teach ";
        }
        intro += student.getName() + ".";
        return intro;
    }

    public boolean isTeaching(Student student){
        for (Klass klass : classes) {
            if(student.getKlass().getNumber() == klass.getNumber()){
                return true;
            }
        }
        return false;
    }
}
