package main.strokecounter.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import main.strokecounter.Course;
import main.strokecounter.R;
import main.strokecounter.Storage;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CreateCourseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreateCourseFragment extends Fragment {

    public CreateCourseFragment() {
        // Required empty public constructor
    }

    public static CreateCourseFragment newInstance(String param1, String param2) {
        CreateCourseFragment fragment = new CreateCourseFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_course, container, false);
        Button btnCreateCourse = view.findViewById(R.id.btnCreateCourse);
        btnCreateCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createCourse(view);
            }
        });
        return view;
    }
    public void createCourse(View view){
        EditText etCourseName = view.findViewById(R.id.etCourseName);
        EditText etnHoleNumber = view.findViewById(R.id.etnHoleNumber);

        Storage.getInstance().addCourse(new Course(etCourseName.getText().toString(), Integer.parseInt(etnHoleNumber.getText().toString())));
    }


}