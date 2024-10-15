package main.strokecounter.completedCourse;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;

import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.R;

public class CompletedCourseListAdapter extends RecyclerView.Adapter<CompletedCourseViewHolder> {

    private Context context;
    private ArrayList<Course> completedCourses = new ArrayList<Course>();

    public CompletedCourseListAdapter(CompletedCoursesActivity completedCoursesActivity, Context context ) {
        this.context = context;
        this.completedCourses = completedCourses;


    }
    @NonNull
    @Override
    public CompletedCourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CompletedCourseViewHolder(LayoutInflater.from(context).inflate(R.layout.completedcourses_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompletedCourseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() { return completedCourses.size();
    }
}
