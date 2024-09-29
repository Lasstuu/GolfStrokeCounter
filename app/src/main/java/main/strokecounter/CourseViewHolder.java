package main.strokecounter;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CourseViewHolder extends RecyclerView.ViewHolder{
    TextView holeNumber, holePar;
    Button btnPlus, btnMinus;
    public CourseViewHolder(@NonNull View itemView) {
        super(itemView);
        holeNumber = itemView.findViewById(R.id.txtHoleNumber);
        holePar = itemView.findViewById(R.id.txtHolePar);
        btnPlus = itemView.findViewById(R.id.btnPlus);
        btnMinus = itemView.findViewById(R.id.btnMinus);
    }
}
