package main.strokecounter.courseStrokeCounting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import main.strokecounter.Hole;
import main.strokecounter.R;

public class CourseStrokeCountListAdapter extends RecyclerView.Adapter<CourseStrokeCountViewHolder> {

    private Context context;
    private ArrayList<Hole> holes = new ArrayList<Hole>();


    public CourseStrokeCountListAdapter(Context context, ArrayList<Hole> holes) {
        this.context = context;
        this.holes = holes;
    }

    @NonNull
    @Override
    public CourseStrokeCountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CourseStrokeCountViewHolder(LayoutInflater.from(context).inflate(R.layout.strokecount_view, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull CourseStrokeCountViewHolder holder, int position) {
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
    }

    @Override
    public int getItemCount() {
        return holes.size();
    }
}

