package practice08;

public class Klass {
    private int number;
    private Student leader;

    Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student leader){
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class " + getNumber();
    }
}
