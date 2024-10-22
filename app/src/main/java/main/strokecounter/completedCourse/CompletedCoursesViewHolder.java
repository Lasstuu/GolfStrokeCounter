package main.strokecounter.completedCourse;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import main.strokecounter.R;

public class CompletedCoursesViewHolder extends RecyclerView.ViewHolder {
    TextView txtScore, txtStrokes, txtDate;
    TextView txtHolePar1, txtHolePar2, txtHolePar3, txtHolePar4, txtHolePar5, txtHolePar6, txtHolePar7, txtHolePar8, txtHolePar9,
            txtHolePar10, txtHolePar11, txtHolePar12, txtHolePar13, txtHolePar14, txtHolePar15, txtHolePar16, txtHolePar17, txtHolePar18;
    TextView txtHoleStrokes1, txtHoleStrokes2, txtHoleStrokes3, txtHoleStrokes4, txtHoleStrokes5, txtHoleStrokes6, txtHoleStrokes7, txtHoleStrokes8, txtHoleStrokes9,
            txtHoleStrokes10, txtHoleStrokes11, txtHoleStrokes12, txtHoleStrokes13, txtHoleStrokes14, txtHoleStrokes15, txtHoleStrokes16, txtHoleStrokes17, txtHoleStrokes18;

    public CompletedCoursesViewHolder(@NonNull View itemView) {
        super(itemView);
        txtScore = itemView.findViewById(R.id.txtScore);
        txtStrokes = itemView.findViewById(R.id.txtStrokes);
        txtDate = itemView.findViewById(R.id.txtDate);
        txtHolePar1 = itemView.findViewById(R.id.txthole1Par);
        txtHolePar2 = itemView.findViewById(R.id.txthole2Par);
        txtHolePar3 = itemView.findViewById(R.id.txthole3Par);
        txtHolePar4 = itemView.findViewById(R.id.txthole4Par);
        txtHolePar5 = itemView.findViewById(R.id.txthole5Par);
        txtHolePar6 = itemView.findViewById(R.id.txthole6Par);
        txtHolePar7 = itemView.findViewById(R.id.txthole7Par);
        txtHolePar8 = itemView.findViewById(R.id.txthole8Par);
        txtHolePar9 = itemView.findViewById(R.id.txthole9Par);
        txtHolePar10 = itemView.findViewById(R.id.txthole10Par);
        txtHolePar11 = itemView.findViewById(R.id.txthole11Par);
        txtHolePar12 = itemView.findViewById(R.id.txthole12Par);
        txtHolePar13 = itemView.findViewById(R.id.txthole13Par);
        txtHolePar14 = itemView.findViewById(R.id.txthole14Par);
        txtHolePar15 = itemView.findViewById(R.id.txthole15Par);
        txtHolePar16 = itemView.findViewById(R.id.txthole16Par);
        txtHolePar17 = itemView.findViewById(R.id.txthole17Par);
        txtHolePar18 = itemView.findViewById(R.id.txthole18Par);
        txtHoleStrokes1 = itemView.findViewById(R.id.txthole1Strokes);
        txtHoleStrokes2 = itemView.findViewById(R.id.txthole2Strokes);
        txtHoleStrokes3 = itemView.findViewById(R.id.txthole3Strokes);
        txtHoleStrokes4 = itemView.findViewById(R.id.txthole4Strokes);
        txtHoleStrokes5 = itemView.findViewById(R.id.txthole5Strokes);
        txtHoleStrokes6 = itemView.findViewById(R.id.txthole6Strokes);
        txtHoleStrokes7 = itemView.findViewById(R.id.txthole7Strokes);
        txtHoleStrokes8 = itemView.findViewById(R.id.txthole8Strokes);
        txtHoleStrokes9 = itemView.findViewById(R.id.txthole9Strokes);
        txtHoleStrokes10 = itemView.findViewById(R.id.txthole10Strokes);
        txtHoleStrokes11 = itemView.findViewById(R.id.txthole11Strokes);
        txtHoleStrokes12 = itemView.findViewById(R.id.txthole12Strokes);
        txtHoleStrokes13 = itemView.findViewById(R.id.txthole13Strokes);
        txtHoleStrokes14 = itemView.findViewById(R.id.txthole14Strokes);
        txtHoleStrokes15 = itemView.findViewById(R.id.txthole15Strokes);
        txtHoleStrokes16 = itemView.findViewById(R.id.txthole16Strokes);
        txtHoleStrokes17 = itemView.findViewById(R.id.txthole17Strokes);
        txtHoleStrokes18 = itemView.findViewById(R.id.txthole18Strokes);
    }
}
