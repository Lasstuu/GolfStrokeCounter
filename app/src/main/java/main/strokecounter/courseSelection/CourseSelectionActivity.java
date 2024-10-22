package main.strokecounter.courseSelection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import main.strokecounter.R;
import main.strokecounter.Storage;
import main.strokecounter.TabActivity;
import main.strokecounter.courseStrokeCounting.CourseStrokeActivity;

public class CourseSelectionActivity extends AppCompatActivity {
    private Storage storage;
    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);
        storage = Storage.getInstance();
        recyclerView = findViewById(R.id.rvCourseSelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CourseSelectionListAdapter(this ,getApplicationContext(), storage.getCourseList()));

    }
    public void switchToCourseStroke(View view, int position){
        Intent intent = new Intent(this, CourseStrokeActivity.class);
        intent.putExtra("coursePosition", position);
        startActivity(intent);
    }


}
