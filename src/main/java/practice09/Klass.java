package practice09;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> students;

    Klass(int number){
        this.number = number;
        students = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void appendMember(Student student){
        this.students.add(student);
    }

    public void assignLeader(Student leader){
        if(students.contains(leader)){
            this.leader = leader;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class " + getNumber();
    }
}
