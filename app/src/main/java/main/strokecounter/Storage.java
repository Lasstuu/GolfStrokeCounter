package main.strokecounter;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Storage {

    private static Storage storage = null;
    ArrayList<Course> courseList = new ArrayList<>();
    ArrayList<Course> completedCourseList = new ArrayList<>();


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

    public ArrayList<Course> getCompletedCourseListByNameHoles(String name, Integer holes) {
        ArrayList<Course> completedCourseNameList = new ArrayList<>();
        storage = Storage.getInstance();

        for (Course course : storage.getCompletedCourseList()) {
            if (Objects.equals(course.getName(), name) && Objects.equals(course.getHoleCount(), holes)) {
                completedCourseNameList.add(course);

            }
        }
        return completedCourseNameList;
    }
    public void saveCourses(Context context) {
        try {
            ObjectOutputStream courseWriter = new ObjectOutputStream(context.openFileOutput("strokecountercourses.data", Context.MODE_PRIVATE));
            courseWriter.writeObject(courseList);
            courseWriter.close();
            ObjectOutputStream completedCourseWriter = new ObjectOutputStream(context.openFileOutput("strokecountercompletedcourses.data", Context.MODE_PRIVATE));
            completedCourseWriter.writeObject(completedCourseList);
            completedCourseWriter.close();
        } catch (IOException e) {
            System.out.println("General I/O exception: " + e.getMessage());
            System.out.println("Save courses failed");
            e.printStackTrace();
        }

    }
    public void loadCourses(Context context) {
        try {
            ObjectInputStream userReader = new ObjectInputStream(context.openFileInput("strokecountercourses.data"));
            courseList = (ArrayList<Course>) userReader.readObject();
            userReader.close();
            ObjectInputStream userReader1 = new ObjectInputStream(context.openFileInput("strokecountercompletedcourses.data"));
            completedCourseList = (ArrayList<Course>) userReader1.readObject();
            userReader1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Load courses failed");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Load courses failed");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Load courses failed");
            e.printStackTrace();
        }

    }



}
