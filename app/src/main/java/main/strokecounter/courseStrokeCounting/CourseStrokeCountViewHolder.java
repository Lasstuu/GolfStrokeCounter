package main.strokecounter.courseStrokeCounting;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;

public class CourseStrokeCountViewHolder extends RecyclerView.ViewHolder{
    TextView holeNumberStroke, holeParStroke, strokeCount;
    Button btnPlusStroke, btnMinusStroke;
    public CourseStrokeCountViewHolder(@NonNull View itemView) {
        super(itemView);
        holeNumberStroke = itemView.findViewById(R.id.txtStrokeHoleNumber);
        holeParStroke = itemView.findViewById(R.id.txtStrokeHolePar);
        btnPlusStroke = itemView.findViewById(R.id.btnPlusStroke);
        btnMinusStroke = itemView.findViewById(R.id.btnMinusStroke);
        strokeCount = itemView.findViewById(R.id.txtHoleStrokes);
    }
}
