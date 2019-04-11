package practice11;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Klass extends Observable {
    private int number;
    private Student leader;
    private ArrayList<Student> students;
    private ArrayList<Observer> observers;

    Klass(int number){
        this.number = number;
        students = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void appendMember(Student student){
        this.students.add(student);
        setChanged();
        notifyObservers(student);
    }

    public void assignLeader(Student leader){
        if(students.contains(leader)){
            this.leader = leader;
        }else {
            System.out.print("It is not one of us.\n");
        }
        setChanged();
        notifyObservers(leader);
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class " + getNumber();
    }

    public boolean isIn(Student student){
        if(number == student.getKlass().getNumber()){
            return true;
        }
        return false;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        observers.add(o);


    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        if(observers.size() != 0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers(Object o) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(this, o);
        }
    }
}
