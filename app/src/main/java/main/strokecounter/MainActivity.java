package main.strokecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import main.strokecounter.completedCourse.CompletedCoursesSelectionActivity;
import main.strokecounter.courseSelection.CourseSelectionActivity;

public class MainActivity extends AppCompatActivity {
    private Storage storage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        storage.getInstance().loadCourses(this);
        setContentView(R.layout.activity_main);

    }

    public void switchToAddCourse(View view){

        Intent intent = new Intent(this, TabActivity.class);
        startActivity(intent);
    }

    public void switchToCourseSelection(View view){
        Intent intent = new Intent(this, CourseSelectionActivity.class);
        startActivity(intent);
    }
    public void switchToCompletedCourses(View view){
        storage.getInstance().loadCourses(this);
        Intent intent = new Intent(this, CompletedCoursesSelectionActivity.class);
        startActivity(intent);
    }

}