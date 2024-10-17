package main.strokecounter;

import java.util.ArrayList;
import java.util.Objects;

public class Storage {
    //Todo: completed courses list eli se minne "scorecardit" tallennetaan
    //Todo: coursejen poistaminen

    private static Storage storage = null;
    private ArrayList<Course> courseList = new ArrayList<>();
    private ArrayList<Course> completedCourseList = new ArrayList<>();


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
    public void addCompletedCourse(Course course){
        completedCourseList.add(course);
    }
    public ArrayList<Course> getCompletedCourseList() {
        return completedCourseList;
    }

    public ArrayList<Course> getCompletedCourseListByName(String name) {
        ArrayList<Course> completedCourseNameList = new ArrayList<>();
        for (Course course : completedCourseList) {
            if (Objects.equals(course.getName(), name)) {
                completedCourseNameList.add(course);
            }
        }
        return completedCourseNameList;
    }

}
