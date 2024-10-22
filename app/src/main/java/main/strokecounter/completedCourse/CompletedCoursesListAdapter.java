package main.strokecounter.completedCourse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.Hole;
import main.strokecounter.R;

public class CompletedCoursesListAdapter extends RecyclerView.Adapter<CompletedCoursesViewHolder>{

    private Context context;
    private ArrayList<Course> completedCourses = new ArrayList<Course>();
    private ArrayList<Hole> holelist = new ArrayList<Hole>();

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
        holelist = completedCourses.get(position).getHoleList();
        holder.txtHolePar1.setText(String.valueOf(holelist.get(0).getHolePar()));
        holder.txtHolePar2.setText(String.valueOf(holelist.get(1).getHolePar()));
        holder.txtHolePar3.setText(String.valueOf(holelist.get(2).getHolePar()));
        holder.txtHolePar4.setText(String.valueOf(holelist.get(3).getHolePar()));
        holder.txtHolePar5.setText(String.valueOf(holelist.get(4).getHolePar()));
        holder.txtHolePar6.setText(String.valueOf(holelist.get(5).getHolePar()));
        holder.txtHolePar7.setText(String.valueOf(holelist.get(6).getHolePar()));
        holder.txtHolePar8.setText(String.valueOf(holelist.get(7).getHolePar()));
        holder.txtHolePar9.setText(String.valueOf(holelist.get(8).getHolePar()));
        holder.txtHolePar10.setText(String.valueOf(holelist.get(9).getHolePar()));
        holder.txtHolePar11.setText(String.valueOf(holelist.get(10).getHolePar()));
        holder.txtHolePar12.setText(String.valueOf(holelist.get(11).getHolePar()));
        holder.txtHolePar13.setText(String.valueOf(holelist.get(12).getHolePar()));
        holder.txtHolePar14.setText(String.valueOf(holelist.get(13).getHolePar()));
        holder.txtHolePar15.setText(String.valueOf(holelist.get(14).getHolePar()));
        holder.txtHolePar16.setText(String.valueOf(holelist.get(15).getHolePar()));
        holder.txtHolePar17.setText(String.valueOf(holelist.get(16).getHolePar()));
        holder.txtHolePar18.setText(String.valueOf(holelist.get(17).getHolePar()));

        holder.txtHolePar1.setText(String.valueOf(holelist.get(0).getHolePar()));
        holder.txtHolePar2.setText(String.valueOf(holelist.get(1).getHolePar()));
        holder.txtHolePar3.setText(String.valueOf(holelist.get(2).getHolePar()));
        holder.txtHolePar4.setText(String.valueOf(holelist.get(3).getHolePar()));
        holder.txtHolePar5.setText(String.valueOf(holelist.get(4).getHolePar()));
        holder.txtHolePar6.setText(String.valueOf(holelist.get(5).getHolePar()));
        holder.txtHolePar7.setText(String.valueOf(holelist.get(6).getHolePar()));
        holder.txtHolePar8.setText(String.valueOf(holelist.get(7).getHolePar()));
        holder.txtHolePar9.setText(String.valueOf(holelist.get(8).getHolePar()));
        holder.txtHolePar10.setText(String.valueOf(holelist.get(9).getHolePar()));
        holder.txtHolePar11.setText(String.valueOf(holelist.get(10).getHolePar()));
        holder.txtHolePar12.setText(String.valueOf(holelist.get(11).getHolePar()));
        holder.txtHolePar13.setText(String.valueOf(holelist.get(12).getHolePar()));
        holder.txtHolePar14.setText(String.valueOf(holelist.get(13).getHolePar()));
        holder.txtHolePar15.setText(String.valueOf(holelist.get(14).getHolePar()));
        holder.txtHolePar16.setText(String.valueOf(holelist.get(15).getHolePar()));
        holder.txtHolePar17.setText(String.valueOf(holelist.get(16).getHolePar()));
        holder.txtHolePar18.setText(String.valueOf(holelist.get(17).getHolePar()));

        holder.txtHoleStrokes1.setText(String.valueOf(holelist.get(0).getHoleStrokes()));
        holder.txtHoleStrokes2.setText(String.valueOf(holelist.get(1).getHoleStrokes()));
        holder.txtHoleStrokes3.setText(String.valueOf(holelist.get(2).getHoleStrokes()));
        holder.txtHoleStrokes4.setText(String.valueOf(holelist.get(3).getHoleStrokes()));
        holder.txtHoleStrokes5.setText(String.valueOf(holelist.get(4).getHoleStrokes()));
        holder.txtHoleStrokes6.setText(String.valueOf(holelist.get(5).getHoleStrokes()));
        holder.txtHoleStrokes7.setText(String.valueOf(holelist.get(6).getHoleStrokes()));
        holder.txtHoleStrokes8.setText(String.valueOf(holelist.get(7).getHoleStrokes()));
        holder.txtHoleStrokes9.setText(String.valueOf(holelist.get(8).getHoleStrokes()));
        holder.txtHoleStrokes10.setText(String.valueOf(holelist.get(9).getHoleStrokes()));
        holder.txtHoleStrokes11.setText(String.valueOf(holelist.get(10).getHoleStrokes()));
        holder.txtHoleStrokes12.setText(String.valueOf(holelist.get(11).getHoleStrokes()));
        holder.txtHoleStrokes13.setText(String.valueOf(holelist.get(12).getHoleStrokes()));
        holder.txtHoleStrokes14.setText(String.valueOf(holelist.get(13).getHoleStrokes()));
        holder.txtHoleStrokes15.setText(String.valueOf(holelist.get(14).getHoleStrokes()));
        holder.txtHoleStrokes16.setText(String.valueOf(holelist.get(15).getHoleStrokes()));
        holder.txtHoleStrokes17.setText(String.valueOf(holelist.get(16).getHoleStrokes()));
        holder.txtHoleStrokes18.setText(String.valueOf(holelist.get(17).getHoleStrokes()));


    }

    @Override
    public int getItemCount() {
        return completedCourses.size();
    }
}
