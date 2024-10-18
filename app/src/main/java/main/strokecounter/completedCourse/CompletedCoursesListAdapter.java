package main.strokecounter.completedCourse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.R;

public class CompletedCoursesListAdapter extends RecyclerView.Adapter<CompletedCoursesViewHolder>{

    private Context context;
    private ArrayList<Course> completedCourses = new ArrayList<Course>();

    public CompletedCoursesListAdapter(Context context, ArrayList<Course> completedCourses){
        this.context = context;
        this.completedCourses = completedCourses;
    }


    @NonNull
    @Override
    public CompletedCoursesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CompletedCoursesViewHolder(LayoutInflater.from(context).inflate(R.layout.completedcourses_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompletedCoursesViewHolder holder, int position) {
        holder.txtScore.setText("Final Score: " + String.valueOf(completedCourses.get(position).getCourseScore()));
        holder.txtStrokes.setText("All Strokes: " + String.valueOf(completedCourses.get(position).getCourseStrokes()));
        holder.txtDate.setText("Date:\n" + String.valueOf(completedCourses.get(position).getCompletionDate()));
    }

    @Override
    public int getItemCount() {
        return completedCourses.size();
    }
}
