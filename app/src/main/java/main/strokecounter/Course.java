package main.strokecounter;

import java.io.Serializable;
import java.util.ArrayList;

public class Course {
    protected String name;
    protected Integer holeCount;

    protected ArrayList <Hole> holeList = new ArrayList<Hole>();

    protected Integer score;
    public Course(String name, Integer holeCount){
        this.name = name;
        this.holeCount = holeCount;
        for (int i = 0; i < holeCount; i++) {
            Hole hole = new Hole(0,0);
            this.holeList.add(hole);
        }

    }

    public String getName() {return name;}
    public Integer getHoleCount() {return holeCount;}
    public ArrayList getHoleList(){return holeList;}
    public Integer getCourseScore(){
        score = 0;
        for(Hole hole : holeList){
            score += hole.getHoleStrokes() - hole.getHolePar();
            System.out.println(hole.getHoleStrokes());
        }
        return score;
    }

    public void resetHoleStrokes() {
        for (Hole hole : holeList) {
            hole.setHoleStrokes(0);
        }
    }
    public void setName(String name) {this.name = name;}
    public void setHoleCount(Integer holeCount) {this.holeCount = holeCount;}
    public void setHoleList(ArrayList<Hole> holeList) {this.holeList = holeList;}

    public Course copyCourse() {

        Course copiedCourse = new Course(this.name, this.holeCount);

        copiedCourse.holeList.clear();

        for (Hole hole : this.holeList) {
            Hole copiedHole = new Hole(hole.getHolePar(), hole.getHoleStrokes());
            copiedCourse.holeList.add(copiedHole);
        }

        return copiedCourse;
    }
}
