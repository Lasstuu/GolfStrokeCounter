package main.strokecounter.courseStrokeCounting;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.R;
import main.strokecounter.Storage;

public class CourseStrokeActivity extends AppCompatActivity {
    private Storage storage;
    private RecyclerView recyclerView;
    private Button btnSaveScorecard;
    private Course saveCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_course_stroke);
        storage = storage.getInstance();
        recyclerView = findViewById(R.id.rvStrokeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CourseStrokeCountListAdapter(getApplicationContext(), storage.getCourseList().get(getIntent().getIntExtra("coursePosition", 0)), storage.getCourseList().get(getIntent().getIntExtra("coursePosition", 0)).getHoleList()));
        btnSaveScorecard = findViewById(R.id.btnSaveCourseScorecard);
        btnSaveScorecard.setOnClickListener(view -> {
            //System.out.println(storage.getCourseList().get(getIntent().getIntExtra("coursePosition", 0)).getName());
            storage.addCompletedCourse(storage.getCourseList().get(getIntent().getIntExtra("coursePosition", 0)).copyCourse());
            storage.getCourseList().get(getIntent().getIntExtra("coursePosition", 0)).resetHoleStrokes();
            finish();
        });

    }
}