package main.strokecounter.courseStrokeCounting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import main.strokecounter.Course;
import main.strokecounter.Hole;
import main.strokecounter.R;
import main.strokecounter.Storage;

public class CourseStrokeCountListAdapter extends RecyclerView.Adapter<CourseStrokeCountViewHolder> {

    private Context context;
    private ArrayList<Hole> holes = new ArrayList<Hole>();
    private Storage storage;
    private Course course;


    public CourseStrokeCountListAdapter(Context context, Course course, ArrayList<Hole> holes) {
        this.context = context;
        this.course = course;
        this.holes = holes;
    }

    @NonNull
    @Override
    public CourseStrokeCountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CourseStrokeCountViewHolder(LayoutInflater.from(context).inflate(R.layout.strokecount_view, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull CourseStrokeCountViewHolder holder, int position) {
        storage = storage.getInstance();
        holder.holeNumberStroke.setText("Hole: " + String.valueOf(position + 1));
        holder.holeParStroke.setText("Par: " + String.valueOf(holes.get(position).getHolePar()));
        holder.strokeCount.setText("Strokes: " + String.valueOf(holes.get(position).getHoleStrokes()));
        holder.btnPlusStroke.setOnClickListener(view -> {
            holes.get(position).setHoleStrokes(holes.get(position).getHoleStrokes() + 1);
            notifyDataSetChanged();
        });
        holder.btnMinusStroke.setOnClickListener(view -> {
            if(holes.get(position).getHoleStrokes() != 0) {
                holes.get(position).setHoleStrokes(holes.get(position).getHoleStrokes() + -1);
            }
            notifyDataSetChanged();
        });
        holder.btnPlusPar.setOnClickListener(view -> {
            holes.get(position).setHolePar(holes.get(position).getHolePar() + 1);
            notifyDataSetChanged();
        });
        holder.btnMinusPar.setOnClickListener(view -> {
            if(holes.get(position).getHolePar() != 0) {
                holes.get(position).setHolePar(holes.get(position).getHolePar() + -1);
            }
            notifyDataSetChanged();
        });

    }

    @Override
    public int getItemCount() {
        return holes.size();
    }
}

