package ProjectPractice;

public class Teacher {
    String name;
    String teacherid;

    public Teacher(){}

    public Teacher(String name, String teacherid) {
        this.name = name;
        this.teacherid = teacherid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }


    @Override
    public String toString(){return name + ", " + teacherid;}
}
