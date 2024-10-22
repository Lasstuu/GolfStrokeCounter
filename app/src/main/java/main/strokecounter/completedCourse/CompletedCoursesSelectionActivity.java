package main.strokecounter.completedCourse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;
import main.strokecounter.Storage;

public class CompletedCoursesSelectionActivity extends AppCompatActivity {
    private Storage storage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_courses_selection);
        storage = storage.getInstance();
        recyclerView = findViewById(R.id.rvCourseCompletions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CompletedCourseSelectionListAdapter(this, this,storage.getCompletedCourseList(), storage.getCourseList()));

    }


}