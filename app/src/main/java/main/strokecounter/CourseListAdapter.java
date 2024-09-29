package main.strokecounter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseListAdapter extends RecyclerView.Adapter<CourseViewHolder> {

    private Context context;
    private ArrayList<Hole> holes = new ArrayList<Hole>();
    private Integer holeNum = 1;


    public CourseListAdapter(Context context, ArrayList<Hole> holes) {
        this.context = context;
        this.holes = holes;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CourseViewHolder(LayoutInflater.from(context).inflate(R.layout.course_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        holder.holeNumber.setText(String.valueOf(position + 1));
        holder.holePar.setText(String.valueOf(holes.get(position).getHolePar()));
        holder.btnPlus.setOnClickListener(view -> {
            holes.get(position).setHolePar(holes.get(position).getHolePar() + 1);
           notifyDataSetChanged();
        });
        holder.btnMinus.setOnClickListener(view -> {
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
