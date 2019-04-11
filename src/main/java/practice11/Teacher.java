package practice11;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class Teacher extends Person implements Observer {
    private LinkedList<Klass> classes;

    Teacher(int id, String name, int age){
        super(id, name, age);
    }

    Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.addObserver(this);
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String intro = super.introduce() + " I am a Teacher. ";
        if (classes == null || classes.size() ==0 ||classes.isEmpty()){
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

    @Override
    public void update(Observable o, Object arg) {
        Klass klass = (Klass) o;
        Student student = (Student) arg;
        String messge = "I am " + getName() + ". I know " + student.getName() +
                ((klass.getLeader() == null) ?
                        " has joined " :
                        " become Leader of ") +
                klass.getDisplayName() + ".\n";
        System.out.print(messge);
    }
}
