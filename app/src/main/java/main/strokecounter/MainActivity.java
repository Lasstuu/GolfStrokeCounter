package main.strokecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import main.strokecounter.courseSelection.CourseSelectionActivity;
import main.strokecounter.courseStrokeCounting.CourseStrokeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

}