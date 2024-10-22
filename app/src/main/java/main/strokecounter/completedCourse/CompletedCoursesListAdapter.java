package main.strokecounter.completedCourse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        TextView[] parTextViews = new TextView[] {
                holder.txtHolePar1, holder.txtHolePar2, holder.txtHolePar3, holder.txtHolePar4,
                holder.txtHolePar5, holder.txtHolePar6, holder.txtHolePar7, holder.txtHolePar8,
                holder.txtHolePar9, holder.txtHolePar10, holder.txtHolePar11, holder.txtHolePar12,
                holder.txtHolePar13, holder.txtHolePar14, holder.txtHolePar15, holder.txtHolePar16,
                holder.txtHolePar17, holder.txtHolePar18
        };

        TextView[] strokesTextViews = new TextView[] {
                holder.txtHoleStrokes1, holder.txtHoleStrokes2, holder.txtHoleStrokes3, holder.txtHoleStrokes4,
                holder.txtHoleStrokes5, holder.txtHoleStrokes6, holder.txtHoleStrokes7, holder.txtHoleStrokes8,
                holder.txtHoleStrokes9, holder.txtHoleStrokes10, holder.txtHoleStrokes11, holder.txtHoleStrokes12,
                holder.txtHoleStrokes13, holder.txtHoleStrokes14, holder.txtHoleStrokes15, holder.txtHoleStrokes16,
                holder.txtHoleStrokes17, holder.txtHoleStrokes18
        };

        int numberOfHoles = holelist.size();

        for (int i = 0; i < numberOfHoles; i++) {
            parTextViews[i].setText(String.valueOf(holelist.get(i).getHolePar()));
            strokesTextViews[i].setText(String.valueOf(holelist.get(i).getHoleStrokes()));
        }

        for (int i = numberOfHoles; i < 18; i++) {
            parTextViews[i].setVisibility(View.GONE);
            strokesTextViews[i].setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return completedCourses.size();
    }
}
