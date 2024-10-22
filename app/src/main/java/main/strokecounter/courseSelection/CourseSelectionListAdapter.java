package main.strokecounter.courseSelection;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.R;
import main.strokecounter.courseStrokeCounting.CourseStrokeActivity;

public class CourseSelectionListAdapter extends RecyclerView.Adapter<CourseSelectionViewHolder> {

    private Context context;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private CourseSelectionActivity courseSelectionActivity;

    public CourseSelectionListAdapter(CourseSelectionActivity courseSelectionActivity, Context context, ArrayList<Course> courses) {
        this.context = context;
        this.courses = courses;
        this.courseSelectionActivity = courseSelectionActivity;
    }

    @NonNull
    @Override
    public CourseSelectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CourseSelectionViewHolder(LayoutInflater.from(context).inflate(R.layout.courseselection_view, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull CourseSelectionViewHolder holder, int position) {
        holder.txtCourseSelName.setText(String.valueOf(courses.get(position).getName()));
        holder.txtCourseSelHoles.setText(String.valueOf("Holes: " + courses.get(position).getHoleCount()));
        holder.lilaCourseSelection.setOnClickListener(view -> {
            courseSelectionActivity.switchToCourseStroke(view, position);


        });

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
}

