package main.strokecounter.completedCourse;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;

import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.R;
import main.strokecounter.Storage;


public class CompletedCourseSelectionListAdapter extends RecyclerView.Adapter<CompletedCourseSelectionViewHolder> {

    private Context context;
    private ArrayList<Course> completedCourses = new ArrayList<Course>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    private Storage storage;

    public CompletedCourseSelectionListAdapter(CompletedCoursesSelectionActivity completedCoursesSelectionActivity, Context context, ArrayList<Course> completedCourses, ArrayList<Course> courses) {
        this.context = context;
        this.completedCourses = completedCourses;
        this.courses = courses;

    }
    @NonNull
    @Override
    public CompletedCourseSelectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CompletedCourseSelectionViewHolder(LayoutInflater.from(context).inflate(R.layout.courseselection_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompletedCourseSelectionViewHolder holder, int position) {
        storage = storage.getInstance();
        holder.txtCourseSelName.setText(String.valueOf(courses.get(position).getName()));
        holder.txtCompletions.setText("Course Completions: " + String.valueOf((storage.getCompletedCourseListByNameHoles(courses.get(position).getName(), courses.get(position).getHoleCount())).size()));
        holder.txtCourseSelHoles.setText(String.valueOf("Holes: " + courses.get(position).getHoleCount()));
        holder.lilaCourseSelection.setOnClickListener(view -> {
            Intent intent = new Intent(context, CompletedCoursesActivity.class);
            intent.putExtra("courseName", courses.get(position).getName());
            intent.putExtra("courseHoles", courses.get(position).getHoleCount());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
}
