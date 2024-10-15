package main.strokecounter.courseStrokeCounting;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;

//Todo: save nappi tallentaa suoritetusta coursesta scorecardin
//Todo: funktionaalisuus suoritettujen coursejen historian näkemiseen

public class CourseStrokeCountViewHolder extends RecyclerView.ViewHolder{
    TextView holeNumberStroke, holeParStroke, strokeCount;
    Button btnPlusStroke, btnMinusStroke, btnPlusPar, btnMinusPar, btnSaveScorecard;
    public CourseStrokeCountViewHolder(@NonNull View itemView) {
        super(itemView);
        holeNumberStroke = itemView.findViewById(R.id.txtStrokeHoleNumber);
        holeParStroke = itemView.findViewById(R.id.txtStrokeHolePar);
        btnPlusStroke = itemView.findViewById(R.id.btnPlusStroke);
        btnMinusStroke = itemView.findViewById(R.id.btnMinusStroke);
        strokeCount = itemView.findViewById(R.id.txtHoleStrokes);
        btnPlusPar = itemView.findViewById(R.id.btnPlusPar);
        btnMinusPar = itemView.findViewById(R.id.btnMinusPar);
        //btnSaveScorecard = itemView.findViewById(R.id.btnSaveCourseScorecard);

    }
}
