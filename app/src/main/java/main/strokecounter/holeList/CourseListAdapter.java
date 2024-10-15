package main.strokecounter.holeList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.Hole;
import main.strokecounter.R;
import main.strokecounter.courseStrokeCounting.CourseStrokeActivity;

public class CourseListAdapter extends RecyclerView.Adapter<CourseViewHolder> {

    private Context context;
//    private ArrayList<Hole> holes = new ArrayList<Hole>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    private Integer holeNum = 1;


    public CourseListAdapter(Context context, ArrayList<Course> courses) {
//        this.context = context;
//        this.holes = holes;
        this.courses = courses;
        this.context = context;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return new CourseViewHolder(LayoutInflater.from(context).inflate(R.layout.course_view, parent, false));
        return new CourseViewHolder(LayoutInflater.from(context).inflate(R.layout.courseselection_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
//        holder.holeNumber.setText(String.valueOf("Hole: " + (position + 1)));
//        holder.holePar.setText(String.valueOf("Par: " + holes.get(position).getHolePar()));
//        holder.btnPlus.setOnClickListener(view -> {
//            holes.get(position).setHolePar(holes.get(position).getHolePar() + 1);
//           notifyDataSetChanged();
//        });
//        holder.btnMinus.setOnClickListener(view -> {
//            if(holes.get(position).getHolePar() != 0) {
//                holes.get(position).setHolePar(holes.get(position).getHolePar() + -1);
//            }
//            notifyDataSetChanged();



        holder.txtCourseHoles.setText("Holes: " + String.valueOf(courses.get(position).getHoleList().size()));
        holder.txtCourseName.setText(courses.get(position).getName());
        holder.lilaCourseSelection.setOnClickListener(view -> {
            Intent intent = new Intent(context, CourseStrokeActivity.class);
            intent.putExtra("coursePosition", position);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        //return holes.size();
        return courses.size();
    }
}
