package main.strokecounter.completedCourse;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;

import java.lang.reflect.Array;
import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.R;
import main.strokecounter.courseStrokeCounting.CourseStrokeActivity;

public class CompletedCourseListAdapter extends RecyclerView.Adapter<CompletedCourseViewHolder> {

    private Context context;
    private ArrayList<Course> completedCourses = new ArrayList<Course>();
    private ArrayList<Course> courses = new ArrayList<Course>();


    public CompletedCourseListAdapter(CompletedCoursesActivity completedCoursesActivity, Context context, ArrayList<Course> completedCourses, ArrayList<Course> courses) {
        this.context = context;
        this.completedCourses = completedCourses;
        this.courses = courses;

    }
    @NonNull
    @Override
    public CompletedCourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CompletedCourseViewHolder(LayoutInflater.from(context).inflate(R.layout.courseselection_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompletedCourseViewHolder holder, int position) {
        holder.txtCourseSelName.setText(String.valueOf(courses.get(position).getName()));
        holder.txtCourseSelHoles.setText(String.valueOf("Holes: " + courses.get(position).getHoleCount()));
        holder.lilaCourseSelection.setOnClickListener(view -> {
            Intent intent = new Intent(context, .class); //Todo: uusi activity jossa näytetään completed courses valitulle courselle
            intent.putExtra("coursePosition", position);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() { return courses.size();
    }
}
