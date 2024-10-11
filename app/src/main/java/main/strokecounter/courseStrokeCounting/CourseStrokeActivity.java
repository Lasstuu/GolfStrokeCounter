package main.strokecounter.courseStrokeCounting;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;
import main.strokecounter.Storage;

public class CourseStrokeActivity extends AppCompatActivity {
    private Storage storage;
    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_course_stroke);
        storage = storage.getInstance();
        recyclerView = findViewById(R.id.rvStrokeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CourseStrokeCountListAdapter(getApplicationContext(), storage.getCourseList().get(getIntent().getIntExtra("coursePosition", 0)).getHoleList()));
    }
}