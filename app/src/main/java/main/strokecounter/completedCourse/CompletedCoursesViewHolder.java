package main.strokecounter.completedCourse;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;

public class CompletedCoursesViewHolder extends RecyclerView.ViewHolder {
    TextView txtScore, txtStrokes, txtDate;

    public CompletedCoursesViewHolder(@NonNull View itemView) {
        super(itemView);
        txtScore = itemView.findViewById(R.id.txtScore);
        txtStrokes = itemView.findViewById(R.id.txtStrokes);
        txtDate = itemView.findViewById(R.id.txtDate);

    }
}
