package main.strokecounter.courseSelection;


import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;
import main.strokecounter.courseStrokeCounting.CourseStrokeActivity;


public class CourseSelectionViewHolder extends RecyclerView.ViewHolder{
    TextView txtCourseSelName, txtCourseSelHoles;
    LinearLayout lilaCourseSelection;
    CourseSelectionActivity courseSelectionActivity;
    public CourseSelectionViewHolder(@NonNull View itemView) {
        super(itemView);
        txtCourseSelHoles = itemView.findViewById(R.id.txtCourseSelHoles);
        txtCourseSelName = itemView.findViewById(R.id.txtCourseSelName);
        lilaCourseSelection = itemView.findViewById(R.id.lilaCourseSelection);


    }
//    public void switchToCourseStrokeHolder(View view){
//        courseSelectionActivity.switchToCourseStroke(view);
//    }

}
