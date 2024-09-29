package main.strokecounter;

import java.util.ArrayList;

public class Storage {
    private static Storage storage = null;
    private ArrayList<Course> courseList = new ArrayList<>();

    public static Storage getInstance(){
        if(storage == null){
            storage = new Storage();
        }
        return storage;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }


    public void addCourse(Course course){
        courseList.add(course);

    }
}
