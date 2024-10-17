package main.strokecounter.completedCourse;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;

public class CompletedCourseSelectionViewHolder extends RecyclerView.ViewHolder {
    TextView txtCourseSelName, txtCourseSelHoles;
    LinearLayout lilaCourseSelection;
    public CompletedCourseSelectionViewHolder(@NonNull View itemView) {
        super(itemView);
        txtCourseSelHoles = itemView.findViewById(R.id.txtCourseSelHoles);
        txtCourseSelName = itemView.findViewById(R.id.txtCourseSelName);
        lilaCourseSelection = itemView.findViewById(R.id.lilaCourseSelection);

    }
}
