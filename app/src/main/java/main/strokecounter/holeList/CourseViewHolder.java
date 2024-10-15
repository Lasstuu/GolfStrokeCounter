package main.strokecounter.holeList;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;
import main.strokecounter.courseStrokeCounting.CourseStrokeActivity;

public class CourseViewHolder extends RecyclerView.ViewHolder{
    TextView holeNumber, holePar, txtCourseName, txtCourseHoles;
    Button btnPlus, btnMinus;
    LinearLayout lilaCourseSelection;
    public CourseViewHolder(@NonNull View itemView) {
        super(itemView);
//        holeNumber = itemView.findViewById(R.id.txtHoleNumber);
//        holePar = itemView.findViewById(R.id.txtHolePar);
//        btnPlus = itemView.findViewById(R.id.btnPlus);
//        btnMinus = itemView.findViewById(R.id.btnMinus);
        txtCourseName = itemView.findViewById(R.id.txtCourseSelName);
        txtCourseHoles = itemView.findViewById(R.id.txtCourseSelHoles);
        lilaCourseSelection = itemView.findViewById(R.id.lilaCourseSelection);
    }

}
