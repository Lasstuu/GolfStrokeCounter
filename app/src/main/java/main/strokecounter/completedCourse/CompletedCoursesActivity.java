package main.strokecounter.completedCourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import main.strokecounter.R;
import main.strokecounter.Storage;

public class CompletedCoursesActivity extends AppCompatActivity {
    private Storage storage;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_courses);
        storage = storage.getInstance();
        String courseName = getIntent().getStringExtra("courseName");
        Integer courseHoles = getIntent().getIntExtra("courseHoles", 0);
        recyclerView = findViewById(R.id.rvCourseCompletions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CompletedCoursesListAdapter(this, storage.getCompletedCourseListByNameHoles(courseName, courseHoles)));


    }
}